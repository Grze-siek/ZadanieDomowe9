package samochodyzklimatyzacja;

public class Vehicle {

    private String name;
    private double tankCapacity;
    private double averageFuelConsumption;

    public Vehicle(String name, double tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void showInfo()
    {
        System.out.printf("Nazwa: %s pojemność baku: %.1f l, średnie spalanie: %.1f l/100km",name, tankCapacity, averageFuelConsumption);
    }
}
