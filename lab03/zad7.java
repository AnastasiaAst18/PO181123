public class zad7 {
    private String brand;
    private double screenDiagonal;
    private String resolution;
    private boolean isSmartTV;
    private double price;
    public zad7(String brand, double screenDiagonal, String resolution, boolean isSmartTV, double price) {
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.resolution = resolution;
        this.isSmartTV = isSmartTV;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public double getScreenDiagonal() {
        return screenDiagonal;
    }
    public String getResolution() {
        return resolution;
    }
    public boolean isSmartTV() {
        return isSmartTV;
    }
    public double getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public void setSmartTV(boolean isSmartTV) {
        isSmartTV = isSmartTV;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void showInformation()
    {
        System.out.println("Informacje o telewizorze: ");
        System.out.println("Marka: " + brand);
        System.out.println("Przekątna ekranu: " + screenDiagonal);
        System.out.println("Rozdzielność: " + resolution);
        System.out.println("SmartTV: " + (isSmartTV ? "tak" : "Nie"));
        System.out.println("Cena: " + price);
        System.out.println();
    }
    public static void main(String[] args)
    {
        zad7 tv = new zad7("Samsung", 55.0, "4K", true, 3499.99);
        tv.showInformation();
        tv.setPrice(2999.99);
        tv.setResolution("8K");
        System.out.println("Po zmianach: ");
        tv.showInformation();
    }
}

