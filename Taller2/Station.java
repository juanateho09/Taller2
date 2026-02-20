package Taller2;

import java.util.ArrayList;
import java.util.List;

public class Station {


    private String code;
    private String location;
    private int capacity;
    private List<Vehicle> vehicles;

    // Constructor
    public Station(String code, String ubication, int capacity) {
        this.code = code;
        this.location = ubication;
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    // Método que recibe un vehiculo en la estacion
    public boolean receiveVehicle(Vehicle v) {
        if (this.vehicles.size() < this.capacity) {
            this.vehicles.add(v);
            return true;
        }
        return false;
    }
    // Metodo que despacha el vehiculo de la estacion
    public void dispatchVehicle(Vehicle v) {
        this.vehicles.remove(v);
    }

    // Getters y Setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
