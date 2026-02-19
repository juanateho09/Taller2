package Taller2;

public class Vehicle {

    // Atributos privados para asegurar el encapsulamiento
    private String id;
    private String vehicleType;
    private String state;
    private int battery;


    // Constructor de la clase Vehicle.
    public Vehicle(String id, String vehicleType, String state, int battery) {
        setId(id);
        setVehicleType(vehicleType);
        setState(state);
        setBattery(battery);
    }
    // Metodo que envía el vehículo a mantenimiento si no lo está ya.
    public void sendToMaintenance() {
        if (this.state.equals("En mantenimiento")) {
            System.out.println("El vehiculo ya esta en mantenimiento.");
        }else {
            this.state = "En mantenimiento";
            System.out.println("El vehículo " + this.id + " ha sido enviado a mantenimiento.");
        }
    }
    // Metodo que saca el vehículo de mantenimiento y lo deja disponible.
    public void takeOutMaintenance() {
        if (this.state.equals("En mantenimiento")) {
            this.state = "Disponible";
            System.out.println("El vehículo " + this.id + " ha salido de mantenimiento y está disponible.");
        } else {
            System.out.println("El vehículo no estaba en mantenimiento, no se puede sacar.");
        }
    }
    // Getters
    public String getId() {
        return id;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getState() {
        return state;
    }
    public int getBattery() {
        return battery;
    }

    // Setter con Validación
    // Verifica que el id cumpla con el requiriemiento de no estar vacio
    public void setId(String id) {
        if (id != null && !id.isEmpty()) {
            this.id = id;
        }else {
            throw new IllegalArgumentException("Error: El id es invalido");
        }
    }

    // Verifica que el tipo de vehiculo sea el adecuado
    public void setVehicleType(String vehicleType) {
        if (vehicleType != null && !vehicleType.isEmpty()) {
            this.vehicleType = vehicleType;
        } else {
            throw new IllegalArgumentException("Error: El tipo de vehículo es obligatorio.");
        }
    }

    // Verifica que el tipo de estado de vehiculo ingresado sea el correcto
    public void setState(String state) {
        if (state.equals("Disponible") || state.equals("En uso") || state.equals("En mantenimiento")) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("Estado inválido: use Disponible, En uso o En mantenimiento");
        }
    }
    // Verifica que el valor de la bateria ingresado sea un valor valido
    public void setBattery(int battery) {
        // Validación importante: La batería debe estar entre 0 y 100
        if (battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            throw new IllegalArgumentException("Error: La batería debe estar entre 0 y 100.");
        }
    }

}
