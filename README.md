# Sistema de Movilidad y Alquiler de Vehículos

Este proyecto es un sistema de gestión en Java para el alquiler de vehículos eléctricos. Permite a los usuarios retirar un vehículo en una estación, realizar un viaje y devolverlo en otra, calculando la tarifa de forma automática.

## Componentes del Sistema

El proyecto está diseñado con un enfoque orientado a objetos, garantizando la integridad de los datos mediante validaciones estrictas:

* **`User` (Usuario):** Gestiona la información del cliente. Valida estrictamente que el nombre sea correcto y restringe los métodos de pago a "Efectivo" o "Tarjeta".
* **`Vehicle` (Vehículo):** Controla el estado operativo ("Disponible", "En uso", "En mantenimiento") y asegura que el nivel de batería se mantenga en un rango lógico de 0 a 100.
* **`Station` (Estación):** Funciona como punto de acopio. Controla el ingreso y salida de vehículos, asegurando que nunca se supere su capacidad máxima.
* **`Rent` (Alquiler):** Es el corazón transaccional del sistema. Registra las fechas y estaciones del viaje, y calcula el costo total al finalizar el recorrido.
* **`SystemMobility` (Gestor Principal):** Coordina todas las operaciones. Inicia alquileres, registra devoluciones y almacena el historial completo de los viajes realizados.

## Esquema de Tarifas

El cálculo del viaje se realiza automáticamente al devolver el vehículo, basándose en las siguientes reglas:

* **Tarifa base:** **$0.5** por cada minuto de uso.
* **Penalidad nocturna:** Recargo del **10%** si el viaje finaliza fuera del horario diurno (después de las 22:00 o antes de las 06:00).
* **Penalidad por batería:** Recargo del **15%** si el vehículo es devuelto con menos del **20%** de carga.

## Ejemplo de Uso Rápido

El sistema centraliza las operaciones a través de la clase `SystemMobility`. Así es como se ve un flujo de ejecución básico:

```java
import Taller2.*;

public class Main {
    public static void main(String[] args) {
        SystemMobility sistema = new SystemMobility();
        
        // Configuración inicial
        User usuario = new User("001", "Carlos Silva", "Tarjeta");
        Vehicle bici = new Vehicle("V-10", "Bicicleta", "Disponible", 100);
        Station origen = new Station("ST-A", "Centro", 20);
        Station destino = new Station("ST-B", "Parque", 15);
        
        // El vehículo debe estar en la estación antes de alquilarse
        origen.receiveVehicle(bici);

        // 1. Iniciar el viaje
        Rent viaje = sistema.startRent(usuario, bici, origen);

        // 2. Finalizar el viaje en el destino (calcula costos y actualiza inventarios)
        sistema.registerReturns(viaje, destino);
    }
}