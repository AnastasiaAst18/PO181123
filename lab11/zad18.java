import java.util.Optional;
import java.util.OptionalDouble;
import java.util.List;
import java.util.Arrays;
class Person5
{
    private String name;
    private int age;
    public Person5(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}
public class zad18
{
    public static void main(String[] args)
    {
        List<Person5> people = Arrays.asList(
                new Person5("Ania", 20),
                new Person5("Bartek", 30),
                new Person5("Kasia", 25),
                new Person5("Marek", 45)
        );
        OptionalDouble averageAge = people.stream()
                .mapToInt(Person5::getAge)
                .average();
        if (averageAge.isPresent())
        {
            System.out.println("Średni wiek: " + averageAge.getAsDouble());
        }
        else
        {
            System.out.println("Lista jest pusta, nie można obliczyć średniej.");
        }
    }
}
