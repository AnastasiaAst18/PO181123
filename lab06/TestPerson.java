public class TestPerson {
    public static  void main(String[] args)
    {
        Person p1 = new Person("Jan", "Kowalski", 25);
        Person p2 = new Person("Jan", "Kowalski", 25);
        Person p3 = new Person(null, "", -5);
        System.out.println(p1);
        System.out.println(p3);
        System.out.println("p1 equals p2? " + p1.equals(p2));
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
    }
}
