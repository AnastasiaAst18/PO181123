import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Osoba s1 = new Student("Anna", "Kowalska", LocalDate.of(2022, 10, 1), "Informatyka");
        Osoba s2 = new PracownikNaukowy("Jan", "Nowak",  LocalDate.of(2015, 3, 15), "Sztuczna Intelegencja");
        Osoba s3 = new PracownikAdministracyjny("Katarzyna", "Zielinska", LocalDate.of(2018, 6, 10), "Sekretarz");
        ArrayList<Osoba> osoby = new ArrayList<>();
        osoby.add(s1);
        osoby.add(s2);
        osoby.add(s3);
        System.out.println("Opisanie osób:");
        for (Osoba o : osoby)
        {
            System.out.println(o.getOpis());
        }
        System.out.println("Różnica lat:");
        System.out.println("Student vs Pracownik Naukowy: " + Osoba.roznicaLat(s1, s2) + " lat");
        System.out.println("Pracownik Naukowy vs Pracownik Administracyjny: " + Osoba.roznicaLat(s2, s3) + " lat");
    }
}
