import java.time.LocalDate;
public class PracownikAdministracyjny extends Osoba{
    private String stanowisko;
    public PracownikAdministracyjny(String imie, String nazwisko, LocalDate dataRozpoczecia, String stanowisko)
    {
        super(imie, nazwisko, dataRozpoczecia);
        this.stanowisko = stanowisko;
    }
    @Override
    public String getOpis()
    {
        return "Pracownik administracyjny: " + imie + " " + nazwisko +  ", stanowisko: " + stanowisko;
    }
}
