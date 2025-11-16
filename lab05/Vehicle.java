public class Vehicle {
    protected String brand;
    protected String model;
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void showInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
