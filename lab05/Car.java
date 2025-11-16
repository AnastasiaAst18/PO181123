public class Car  extends Vehicle{
    private int numberOfDoors;
    public Car(String brand, String model, int numberOfDoors){
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
    public void showCarInfo()
    {
        showInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
