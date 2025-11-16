public class zad7 {
    public static void main(String[] args) {
        int liczba = 1;
        int licznikParzystych = 0;
        int licznikNieparzystych = 0;
        System.out.println("Pierwsze 20 liczb parzystych: ");
        liczba = 1;
        do
        {
            if (liczba % 2 == 0)
            {
                System.out.print(liczba + " ");
                licznikParzystych++;
            }
            liczba++;
        }
        while (licznikParzystych < 20);
        System.out.println("\nPierwsze 20 liczb nieparzystych: ");
        liczba = 1;
        do
        {
            if (liczba % 2 != 0)
            {
                System.out.print(liczba + " ");
                licznikNieparzystych++;
            }
            liczba++;
        }
        while (licznikNieparzystych < 20);
    }
}
