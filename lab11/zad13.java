import java.util.List;
import java.util.Arrays;
class Person2
{
    private String name;
    public Person2(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
public class zad13
{
    public static void main(String[] args)
    {
        List<Person2> people = Arrays.asList(
                new Person2("Ania"),
                new Person2("Bob"),
                new Person2("David")
        );
        people.stream()
                .map(Person2::getName)
                .forEach(System.out::println);
    }
}