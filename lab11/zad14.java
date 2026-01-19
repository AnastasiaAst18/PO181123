import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
class Person3
{
    private String name;
    public Person3(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Person{name='" + name + "'}";
    }
}
public class zad14
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Ania", "Bartek", "KAsia", "Marek");
        List<Person3> people = names.stream()
                .map(Person3::new)
                .collect(Collectors.toList());
        people.forEach(System.out::println);
    }
}
