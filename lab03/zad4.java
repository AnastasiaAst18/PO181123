class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}
public class zad4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Jan Kowalski");
        System.out.println("Pracownik: " + emp.name);
    }
}
