public class Person {
    String name;
    public void introduceYourself()
    {
        System.out.println("Hi, I'm " + name);
    }
    public void sayHello(Person other)
    {
        System.out.println("Hello, " + other.name);
    }
    public void changeName(String name)
    {
        this.name = name;
    }
    public void swapNames(Person other)
    {
        String temp = this.name;
        this.name = other.name;
        other.name = temp;
    }
}
