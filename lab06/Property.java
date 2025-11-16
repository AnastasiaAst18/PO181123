import java.util.Objects;
public class Property {
    private String address;
    private  double size;
    private double price;
    public Property(String address, double size, double price)
    {
        this.address = address != null ? address : "";
        this.size = size >= 0 ? size : 0;
        this.price = price >= 0 ? price : 0;
    }
    public String getAdress() {
        return address;
    }
    public void setAdress(String address) {
        this.address = address != null ? address : "";
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size >= 0 ? size : 0;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price >= 0 ? price : 0;
    }
    @Override
    public String toString() {
        return "Property: " + address + "\nSize: " + size + "\nPrice: " + price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Property other = (Property) obj;
        return Double.compare(size, other.size) == 0 &&
                Double.compare(price, other.price) == 0 &&
                Objects.equals(address, other.address);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, size, price);
    }
}
