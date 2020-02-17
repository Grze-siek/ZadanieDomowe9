package samochodyzklimatyzacja;

public class RentalAgency {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Toyota Yaris", 80, 5, false);
        vehicles[1] = new Car("Audi a3", 100, 8, true);
        vehicles[2] = new Truck("truck1", 150, 12, true, 300);
        vehicles[3] = new Truck("truck2", 150, 13, true, 0);

        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
        }
    }
}
