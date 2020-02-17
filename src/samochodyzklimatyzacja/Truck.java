package samochodyzklimatyzacja;

public class Truck extends Car {

    private double cargoWeight;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean airCondition, double cargoWeight) {
        super(name, tankCapacity, averageFuelConsumption, airCondition);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double totalFuelConsumption() {
        double cargoFuelConsumption = 0.5 * getCargoWeight() / 100;
        double totalFuelConsumption = getAverageFuelConsumption() + cargoFuelConsumption;
        if(isAirCondition())
            totalFuelConsumption += 1.6;
        return totalFuelConsumption;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public double vehicleRange() {
        return super.vehicleRange();
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

}
