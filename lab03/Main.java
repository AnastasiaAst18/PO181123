public class Main {
    public static void main(String[] args) {
        zad3 zad3 = new zad3("Jan Kowalski", "1234567890");
        System.out.println("Imię: " + zad3.name);
        System.out.println("Hasło: " + zad3.getPassword());
        zad3.setPassword("0987654321");
        System.out.println(("Nowe hasło: " + zad3.getPassword()));
    }
}
