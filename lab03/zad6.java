public class zad6 {
    String brand;
    String model;
    int productionYear;
    public zad6()
    {
        brand = "Nieznana marka";
        model = "Nieznany model";
        productionYear = 0;
    }
    public zad6(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.productionYear = 0;
    }
    public zad6(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }
    public void  displayInfo()
    {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + productionYear);
        System.out.println();
    }
    public static void main(String[] args) {
        zad6 zad6a = new zad6();
        System.out.println("Samochód 1 (konstruktor domyślny): ");
        zad6a.displayInfo();
        zad6 zad6b = new zad6("Toyota", "Corolla");
        System.out.println("Samochód 2 (konstruktor 2-argumentowy): ");
        zad6b.displayInfo();
        zad6 zad6c = new zad6("BMW", "X5", 2020);
        System.out.println("Samochód 3 (konstruktor 3-argumentowy): ");
        zad6c.displayInfo();
    }
}
