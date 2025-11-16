import java.time.LocalDate;
public class Student extends Osoba{
    private String kierunek;
    public Student(String imie, String nazwisko, LocalDate dataRozpoczecia, String kierunek)
    {
        super(imie ,nazwisko,dataRozpoczecia);
        this.kierunek = kierunek;
    }
    @Override
    public String getOpis()
    {
        return "Student: " + imie + " " + nazwisko + ", kierunek: " +  kierunek;
    }
}
