import java.util.Scanner;

public class zad4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();
        boolean przestępny;
        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0))
        {
            przestępny = true;
        }
        else
        {
            przestępny = false;
        }
        if (przestępny)
        {
            System.out.println(rok + " jest rokiem przestępnym.");
        }
        else
        {
            System.out.println(rok + " nie jest rokiem przestępnym.");
        }
        scanner.close();
    }
}
