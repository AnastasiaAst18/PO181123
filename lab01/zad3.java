public class zad3 {
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double c = 3;
        double d = 8;
        System.out.println("Wartości początkowe: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        a += 4;
        b -= a;
        c = c * (2 - 4 * a);
        d /= (4 - a * a);
        System.out.println("Wyniki po wykonaniu operacji: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
