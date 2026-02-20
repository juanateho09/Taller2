package Taller2;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Iniciando Sistema de Movilidad ===");

        // 1. Instanciar el sistema central
        SystemMobility sistema = new SystemMobility();

        // 2. Crear las entidades básicas (Usuario, Vehículo, Estaciones)
        System.out.println("\n[1] Creando entidades...");
        User usuario = new User("1001", "Juan Perez", "Tarjeta");
        Vehicle scooter = new Vehicle("V-001", "Scooter", "Disponible", 85);
        Station estacionOrigen = new Station("ST-01", "Plaza Central", 10);
        Station estacionDestino = new Station("ST-02", "Parque Norte", 15);

        // 3. Preparar el entorno (El vehículo debe estar en la estación antes de alquilarse)
        estacionOrigen.receiveVehicle(scooter);
        System.out.println("Vehículo agregado a la estación origen: " + estacionOrigen.getLocation());

        // 4. Operación 1: Iniciar el alquiler
        System.out.println("\n[2] Operación: Iniciar alquiler...");
        Rent viaje = sistema.startRent(usuario, scooter, estacionOrigen);

        // Opcional: Simular que pasa un poco de tiempo en el viaje (2 segundos)
        // Esto ayudará a que las fechas de inicio y fin sean ligeramente diferentes
        try {
            System.out.println("... viaje en curso ...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5. Operación 2: Devolver el vehículo en otra estación
        System.out.println("\n[3] Operación: Registrar devolución...");
        sistema.registerReturns(viaje, estacionDestino);

        // 6. Operación 3: Comprobar el estado final del sistema
        System.out.println("\n=== Resumen del Sistema ===");
        System.out.println("Historial de viajes: " + sistema.getRentalHistory().size());
        System.out.println("Vehículos en Plaza Central (Origen): " + estacionOrigen.getVehicles().size());
        System.out.println("Vehículos en Parque Norte (Destino): " + estacionDestino.getVehicles().size());
    }
}