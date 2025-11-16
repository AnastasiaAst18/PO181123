public class TestKalkulatorStatyczny {
    public static void main(String[] args) {
        System.out.println("Dodawanie: " + KalkulatorStatyczny.dodaj(5, 3));
        System.out.println("Odejmowanie: " + KalkulatorStatyczny.odejmij(10, 4));
        System.out.println("Mnożenie: " + KalkulatorStatyczny.pomnoz(6, 7));
        System.out.println("Liczba wykonanych operacji: " + KalkulatorStatyczny.liczbaOperacji);
    }
}
