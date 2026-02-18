package Taller2;

import java.util.ArrayList;
import java.util.List;

public class Station {


    private String code;
    private String ubication;
    private int capacity;



    private List<Vehicle> vehicles;

    // Constructor
    public Station(String code, String ubication, int capacity) {
        this.code = code;
        this.ubication = ubication;
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    // Métodos públicos

    public boolean receiveVehicle(Vehicle v) {
        if (this.vehicles.size() < this.capacity) {
            this.vehicles.add(v);
            return true;
        }
        return false;
    }

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

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
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
