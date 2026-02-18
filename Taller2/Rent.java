package Taller2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Rent {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Station originStation;
    private Station destinationStation;
    private double totalCost;
    private Vehicle rentalVehicle;

    // Constructor

    public Rent(LocalDateTime startDate, Station originStation, Vehicle rentalVehicle){
        this.startDate = startDate;
        this.endDate = null;
        this.originStation = originStation;
        this.destinationStation = null;
        this.totalCost = 0;
        this.rentalVehicle = rentalVehicle;

    }
    // Métodos

    public void endRent(Station destinationStation){
        this.endDate = LocalDateTime.now();
        this.destinationStation = destinationStation;
        this.totalCost = calculateCost();
    }

    public double calculateCost() {
        long minutes = ChronoUnit.MINUTES.between(startDate, endDate);
        double baseCost = minutes * 0.5;

        int hour = endDate.getHour();
        double penalty = (hour > 22 || hour < 6) ? baseCost * 0.1 : 0;

        return baseCost + penalty;
    }

    // Getters


    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Station getOriginStation() {
        return originStation;
    }

    public Station getDestinationStation() {
        return destinationStation;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Vehicle getRentalVehicle() {
        return rentalVehicle;
    }

    // Setters

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setOriginStation(Station originStation) {
        this.originStation = originStation;
    }

    public void setDestinationStation(Station destinationStation) {
        this.destinationStation = destinationStation;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setRentalVehicle(Vehicle rentalVehicle) {
        this.rentalVehicle = rentalVehicle;
    }

}
