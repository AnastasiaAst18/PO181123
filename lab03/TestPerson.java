public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        p1.introduceYourself();
        Person p2 = new Person();
        p2.name = "Bob";
        p1.sayHello(p2);
        p1.changeName("Emma");
        p1.introduceYourself();
        Person x = new Person();
        x.name = "Kate";
        Person y = new Person();
        y.name = "Tom";
        System.out.println("Przed zamianą: ");
        x.introduceYourself();
        y.introduceYourself();
        x.swapNames(y);
        System.out.println("Po zamianie: ");
        x.introduceYourself();
        y.introduceYourself();
    }
}
