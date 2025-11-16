import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj znak: ");
        char znak = scanner.next().charAt(0);
        System.out.print("Podaj wysokość piramidy: ");
        int n =  scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++)
        {
            int liczbaZnakow = 2 * i - 1;
            for (int j = 0; j < liczbaZnakow; j++)
            {
                sb.append(znak);
            }
            sb.append("\n");
        }
        System.out.println("Piramida: \n" + sb.toString());
        scanner.close();
    }
}
