public class zad8 {
    private String imie;
    private int wiek;
    private zad8(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public static zad8 stworzOsobe(String imie, int wiek) {
        if (wiek < 0)
        {
            System.out.println("Wiek nie może być ujemny.");
            return null;
        }
        return new zad8(imie, wiek);
    }
    public void pokarInformacje()
    {
        System.out.println("Imie: " + imie);
        System.out.println("Wiek: " + wiek);
        System.out.println();
    }
    public static void main(String[] args) {
        zad8 osoba1 = zad8.stworzOsobe("Jan", 25);
        if (osoba1 != null) osoba1.pokarInformacje();
        zad8 osoba2 = zad8.stworzOsobe("Anna", -5);
        if (osoba2 != null) osoba2.pokarInformacje();
    }
}
