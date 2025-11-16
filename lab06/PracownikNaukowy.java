import java.time.LocalDate;
public class PracownikNaukowy extends Osoba {
    private String specjalizacja;
    public PracownikNaukowy(String imie, String nazwisko, LocalDate dataRozpoczecia, String specjalizacja)
    {
        super(imie, nazwisko, dataRozpoczecia);
        this.specjalizacja = specjalizacja;
    }
    @Override
    public String getOpis()
    {
        return "Pracownik naukowy: " + imie +  " " + nazwisko + ", specjalizacja: " + specjalizacja;
    }
}
