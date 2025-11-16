
import java.util.Objects;
public class Apartment extends Property{
    private int floorNumber;
    public Apartment(String address, double size, double price, int floorNumber) {
        super(address, size, price);
        this.floorNumber = floorNumber >= 0 ? floorNumber : 0;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber >= 0 ? floorNumber : 0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Floor Number: " + floorNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Apartment other = (Apartment) obj;
        return floorNumber == other.floorNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), floorNumber);
    }
}
