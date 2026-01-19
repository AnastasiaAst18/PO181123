import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
class Person
{
    private String name;
    private int age;
    public  Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public int getAge() {return age;}
    public String getName() {return name;}
    @Override
    public String toString()
    {
        return name + " (" +  age + ")";
    }
}
public class zad9
{
    public  static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Julia", 18));
        people.add(new Person("Ania", 10));
        people.add(new Person("Bartek", 38));
        people.add(new Person("Marek", 21));
        Predicate<Person> isAdult = p -> p.getAge() >= 18;
        List<Person> adults = people.stream()
                .filter(isAdult)
                .collect(Collectors.toList());
        System.out.println("Osoby pełnoletnie: " + adults);
    }
}