package Taller2;

public class Vehicle {

    private String id;
    private String vehicleType;
    private String state;
    private int battery;


    //constructor
    public Vehicle(String id, String vehicleType, String state, int battery) {
        setId(id);
        setVehicleType(vehicleType);
        setState(state);
        setBattery(battery);
    }
    //metodo para enviar vehiculo a mantenimiento
    public void sendToMaintenance() {
        if (this.state.equals("En mantenimiento")) {
            System.out.println("El vehiculo ya esta en mantenimiento.");
        }else {
            this.state = "En mantenimiento";
            System.out.println("El vehículo " + this.id + " ha sido enviado a mantenimiento.");
        }
    }
    //metodo para sacar el vehiculo de mantenimiento
    public void takeOutMaintenance() {
        if (this.state.equals("En mantenimiento")) {
            this.state = "Disponible";
            System.out.println("El vehículo " + this.id + " ha salido de mantenimiento y está disponible.");
        } else {
            System.out.println("El vehículo no estaba en mantenimiento, no se puede sacar.");
        }
    }
    //getters
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
    //setter con verificacion para id
    public void setId(String id) {
        if (id != null && !id.isEmpty()) {
            this.id = id;
        }else {
            throw new IllegalArgumentException("Error: El id es invalido");
        }
    }
    //setter con verificacion para tipo de vehiculo
    public void setVehicleType(String vehicleType) {
        if (vehicleType != null && !vehicleType.isEmpty()) {
            this.vehicleType = vehicleType;
        } else {
            throw new IllegalArgumentException("Error: El tipo de vehículo es obligatorio.");
        }
    }
    //setter con verificacion para estado de vehiculo
    public void setState(String state) {
        if (state.equals("Disponible") || state.equals("En uso") || state.equals("En mantenimiento")) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("Estado inválido: use Disponible, En uso o En mantenimiento");
        }
    }
    //setter con verificacion para la bateria
    public void setBattery(int battery) {
        // Validación importante: La batería debe estar entre 0 y 100
        if (battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            throw new IllegalArgumentException("Error: La batería debe estar entre 0 y 100.");
        }
    }


}
