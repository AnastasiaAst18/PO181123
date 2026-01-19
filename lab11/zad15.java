import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Person4{
    private String name;
    public Person4(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
public class zad15
{
    public static void main(String[] args)
    {
        List<Person4> people = Arrays.asList(
                new Person4("Zenon"),
                new Person4("Ania"),
                new Person4("Bartek")
        );
        people.sort(Comparator.comparing(Person4::getName));
        System.out.println("Posortowana lista: " + people);
    }
}