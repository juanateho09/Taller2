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

    // Metodo para empezar un nuevo alquiler
    public Rent startRent(User user, Vehicle vehicle, Station originStation) {
        // Condicional que verifica que el vehiculo este disponible y no este en "Mantenimiendo" o "En uso"
        if (!vehicle.getState().equals("Disponible")) {
            System.out.println("Error: El vehículo no está disponible");
            return null;
        }

        Rent newRent = new Rent(LocalDateTime.now(), originStation, vehicle, user);
        vehicle.setState("En uso"); // Coloca el vehiculo en estado de uso
        originStation.dispatchVehicle(vehicle); // Despacha el vehiculo de la estacion
        rentalHistory.add(newRent); // Añade el alquiler al historial
        System.out.println("Alquiler iniciado exitosamente");
        return newRent;
    }
        // Metodo para registrar cuando devuelvan el vehiculo
    public void registerReturns(Rent rent, Station destinationStation) {
        // Condicional que virifica que la estacion no este llena para poder recibirlo
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