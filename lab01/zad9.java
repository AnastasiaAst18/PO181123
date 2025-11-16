import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drudą liczbę: ");
        int b = scanner.nextInt();
        int nwd = obliczNWD(a, b);
        int nww = Math.abs(a * b) / nwd;
        System.out.println("Najmniejsza wspólna wielokrotność (NWW) liczb " + a + " i " + b + " = " + nww);
        scanner.close();
    }
    public static int obliczNWD(int a, int b) {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
