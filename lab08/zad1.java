import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfBirth;
    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public int compareTo(Student o) {
        return Double.compare(o.averageGrade, this.averageGrade);
    }
    @Override
    public String toString() {
        return String.format("Student: %-10s | Średnia: %.2f | Rok ur.: %d",  name, averageGrade, yearOfBirth);
    }
}
public class zad1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ania", 4.5, 2002));
        students.add(new Student("Bartek", 3.8, 2001));
        students.add(new Student("Kasia", 5.0, 2003));
        students.add(new Student("Marek", 4.2, 2002));
        students.add(new Student("Zosia", 4.9, 2003));
        System.out.println("Lista przed sortowaniem: ");
        students.forEach(System.out::println);
        Collections.sort(students);
        System.out.println("Lista po sortowaniu (malejąco według średniej): ");
        students.forEach(System.out::println);
    }
}
