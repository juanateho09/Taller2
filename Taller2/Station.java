package Taller2;

import java.util.ArrayList;
import java.util.List;

public class Station {

    // Atributos privados tal como se muestran en el UML
    private String code;
    private String ubication;
    private int capacity;

    // Atributo adicional para manejar la agregación (rombo blanco)
    // Necesario para que los métodos receive y dispatch funcionen
    private List<Vehicle> vehicles;

    // Constructor
    public Station(String code, String ubication, int capacity) {
        this.code = code;
        this.ubication = ubication;
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    // Métodos públicos según el UML

    public boolean receiveVehicle(Vehicle v) {
        // Regla de negocio: Si hay espacio, lo recibe y retorna true.
        if (this.vehicles.size() < this.capacity) {
            this.vehicles.add(v);
            return true;
        }
        // Si la estación está llena, retorna false
        return false;
    }

    public void dispatchVehicle(Vehicle v) {
        // Remueve el vehículo de la lista de la estación
        this.vehicles.remove(v);
    }

    // Getters y Setters (Buenas prácticas de POO para atributos privados)

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
