import java.util.Objects;
public class House extends Property{
    private int numberOfFloors;
    public House(String address, double size, double price, int numberOnFloors) {
        super(address, size, price);
        this.numberOfFloors = numberOnFloors >= 0 ? numberOnFloors : 0;
    }
    public int getNumberOnFloors() {
        return numberOfFloors;
    }
    public void setNumberOnFloors(int numberOnFloors) {
        this.numberOfFloors = numberOnFloors >= 0 ? numberOnFloors : 0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Number of Floors: " + numberOfFloors;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        House other = (House) obj;
        return numberOfFloors == other.numberOfFloors;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfFloors);
    }
}
