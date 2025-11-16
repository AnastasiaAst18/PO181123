import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
public class Gradebook {
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;
    public Gradebook(String firstName, String lastName) {
        this.firstName = firstName != null ? firstName : "";
        this.lastName = lastName != null ? lastName : "";
        this.grades = new ArrayList<>();
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = (firstName != null) ? firstName : "";
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = (lastName != null) ? lastName : "";
    }
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }
    public void setGrades(ArrayList<Integer> grades) {
        if (grades != null) {
            this.grades = new ArrayList<>(grades);
        }
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public void removeGrade(int index) {
        if (index >= 0 && index < grades.size())
        {
            grades.remove(index);
        }
    }
    public double averageGrade()
    {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (int grade : grades)
        {
            sum += grade;
        }
        return sum / grades.size();
    }
    @Override
    public String toString() {
        return "Gradebook for " + firstName + " " + lastName + ": Average Grade = " + averageGrade() + ", Grades: " + grades + ".";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gradebook other = (Gradebook) obj;
        return Objects.equals(firstName, other.firstName) &&
                Objects.equals(lastName, other.lastName) &&
                Objects.equals(grades, other.grades);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, grades);
    }
}
