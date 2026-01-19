import java.util.Arrays;
import java.util.Comparator;

class WiekComparator implements Comparator<Osoba>
{
    @Override
    public int compare(Osoba o1, Osoba o2)
    {
        return Integer.compare(o1.getWiek(), o2.getWiek());
    }
}

public class zad3 {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[5];
        osoby[0] = new Osoba("Jan", 25, 180.5);
        osoby[1] = new Osoba("Anna", 19, 165.0);
        osoby[2] = new Osoba("Piotr", 32, 158.0);
        osoby[3] = new Osoba("Ewa", 15, 163.0);
        osoby[4] = new Osoba("Marek", 21, 160.8);
        System.out.println("Tablica przed sortowaniem: ");
        for (Osoba o : osoby)
        {
            System.out.println(o);
        }
        Arrays.sort(osoby, new WiekComparator());
        System.out.println("Tablica po sortowaniu według wieku (rosnąco): ");
        for (Osoba o : osoby)
        {
            System.out.println(o);
        }
    }
}
