package samochodyzklimatyzacja;

public class Car extends Vehicle{

   private boolean airCondition = false;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airCondition) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airCondition = airCondition;
    }

    public double totalFuelConsumption()
   {
       double totalFuelConsumption = 0;
      if(airCondition)
          totalFuelConsumption = getAverageFuelConsumption() + 0.8;
      else
        totalFuelConsumption = getAverageFuelConsumption();

       return totalFuelConsumption;
   }

   public double vehicleRange()
   {
      return getTankCapacity() / totalFuelConsumption() * 100;
   }

    public boolean isAirCondition() {
        return airCondition;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf(", całkowite spalanie: %.2f l/100km, zasięg: %.2f km, klimatyzacja: %b\n", totalFuelConsumption(), vehicleRange(), isAirCondition());
    }
}
