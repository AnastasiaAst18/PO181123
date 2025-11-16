import java.util.Scanner;

public class zad6 {
    enum Miesiac {
        STYCZEN, LUTY, MARZEC, KWIECIEN, MAJ, CZERWIEC, LIPIEC, SIERPIEN, WRZESIEN, PAZDZERNIK, LISTOPAD, GRUDZIEN
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzień: ");
        int dzien = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Podaj miesiąc: ");
        String miesiacTekst = scanner.nextLine().trim().toUpperCase();
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();
        try
        {
            Miesiac  miesiac = Miesiac.valueOf(miesiacTekst);
            boolean poprawna = czyPoprawnaData(dzien, miesiac, rok);
            if (poprawna) {
                System.out.println("Poprawna data");
            }
            else
            {
                System.out.println("Niepoprawna data");
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println("Niepoprawna nazwa miesiąca");
        }
        scanner.close();
    }
    public static boolean czyPoprawnaData(int dzien, Miesiac miesiac, int rok){
        int dniwMiesiacu;
        switch (miesiac) {
            case STYCZEN:
            case MARZEC:
            case MAJ:
            case LIPIEC:
            case SIERPIEN:
            case PAZDZERNIK:
            case GRUDZIEN:
                dniwMiesiacu = 31;
                break;
            case KWIECIEN:
            case CZERWIEC:
            case WRZESIEN:
            case LISTOPAD:
                dniwMiesiacu = 30;
                break;
            case LUTY:
                if (czyRokPrzestepny(rok)) {
                    dniwMiesiacu = 29;
                }
                else {
                    dniwMiesiacu = 28;
                }
                break;
            default:
                return false;
        }
        return dzien >= 1 && dzien <= dniwMiesiacu;
    }
    public static boolean czyRokPrzestepny(int rok){
        return (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);
    }
}
