public class zad1 {
    String name;
    String breed;
    int age;
    public zad1(String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void bark()
    {
        System.out.println("Wow Wow");
    }
    public void displayInfo()
    {
        System.out.println("Imię: " + name + ", \nRasa: " + breed + ", \nWiek: " + age);
    }
    public static void main(String[] args)
    {
        zad1 myDog = new zad1("Reks", "Labrador", 3);
        myDog.displayInfo();
        myDog.bark();
    }
}
