import java.util.Objects;
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age) {
        if (firstName == null || firstName.trim().isEmpty())
        {
            this.firstName = "";
        }
        else
        {
            this.firstName = firstName;
        }
        if (lastName == null || lastName.trim().isEmpty())
        {
            this.lastName = "";
        }
        else
        {
            this.lastName = lastName;
        }
        if (age < 0)
        {
            this.age = 0;
        }
        else
        {
            this.age = age;
        }
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString()
    {
        return "Person: " + firstName + " " + lastName + ", Age: " + age + ".";
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age &&
                Objects.equals(firstName, other.firstName) &&
                Objects.equals(lastName, other.lastName);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(firstName, lastName, age);
    }
}
