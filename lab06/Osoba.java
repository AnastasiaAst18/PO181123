import java.time.LocalDate;
public abstract class Osoba {
    protected String imie;
    protected String nazwisko;
    protected LocalDate dataRozpoczecia;
    public Osoba(String imie, String nazwisko, LocalDate dataRozpoczecia) {
        this.imie = (imie != null ? imie : "");
        this.nazwisko = (nazwisko != null ? nazwisko : "");
        this.dataRozpoczecia = dataRozpoczecia;
    }
    public abstract String getOpis();
    public static long roznicaLat(Osoba a, Osoba b)
    {
        LocalDate d1 = a.dataRozpoczecia;
        LocalDate d2 = b.dataRozpoczecia;
        if (d2.isBefore(d1)) {
            LocalDate temp = d1;
            d1 = d2;
            d2 = temp;
        }
        long lata = d2.getYear() - d1.getYear();
        if (d2.getMonthValue() < d1.getMonthValue() && d2.getDayOfMonth() < d1.getDayOfMonth()) {
            lata--;
        }
        return lata;
    }
}
