public class TestProperty {
    public static void main(String[] args) {
        House house1 = new House("123 Main St", 120.5, 500000, 2);
        House house2 = new House("123 Main St", 120.5, 500000, 2);
        Apartment apt1 = new Apartment("45 Elm St", 80.0, 300000, 3);
        System.out.println(house1);
        System.out.println(apt1);
        System.out.println("house1 equels house2? " + house1.equals(house2));
        System.out.println("house1 equels apt1? " + house1.equals(apt1));
        System.out.println("house1 hashCode: " + house1.hashCode());
        System.out.println("house2 hashCode: " + house2.hashCode());
        System.out.println("apt1 hashCode: " + apt1.hashCode());
        apt1.setFloorNumber(4);
        apt1.setPrice(320000);
        System.out.println("After update: " + apt1);
    }
}
