public class TestGradebook {
    public static void main(String[] args) {
        Gradebook g1 = new Gradebook("Jan", "Kowalski");
        g1.addGrade(5);
        g1.addGrade(3);
        g1.addGrade(4);
        System.out.println(g1);
        g1.removeGrade(1);
        System.out.println(g1);
        Gradebook g2 = new Gradebook("Jan", "Kowalski");
        g2.addGrade(5);
        g2.addGrade(4);
        System.out.println("Czy g1 = g2? " + g1.equals(g2));
        System.out.println("hashCodes: " + g1.hashCode() + " | " + g2.hashCode());
    }
}
