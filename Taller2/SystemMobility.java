package Taller2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SystemMobility {

    private List<Rent> rentalHistory;

    // Constructor
    public SystemMobility() {
        this.rentalHistory = new ArrayList<>();
    }

    // Metodos
    public Rent startRent(User user, Vehicle vehicle, Station originStation) {

        if (!vehicle.getState().equals("Disponible")) {
            System.out.println("Error: El vehículo no está disponible");
            return null;
        }

        Rent newRent = new Rent(LocalDateTime.now(), originStation, vehicle, user);
        vehicle.setState("En uso");
        originStation.dispatchVehicle(vehicle);
        rentalHistory.add(newRent);
        System.out.println("Alquiler iniciado exitosamente");
        return newRent;
    }

    public void registerReturns(Rent rent, Station destinationStation) {

        if (destinationStation.getVehicles().size() >= destinationStation.getCapacity()) {
            System.out.println("Error: La estación está llena");
            return;
        }

        rent.endRent(destinationStation);
        rent.getRentalVehicle().setState("Disponible");
        destinationStation.receiveVehicle(rent.getRentalVehicle());
        System.out.println("Devolución registrada exitosamente");
        System.out.println("Costo total: $" + rent.getTotalCost());
    }

    // Getters
    public List<Rent> getRentalHistory() {
        return rentalHistory;
    }

    // Setters
    public void setRentalHistory(List<Rent> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }
}