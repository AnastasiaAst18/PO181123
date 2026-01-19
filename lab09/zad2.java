public class zad2 {
    public static void main(String[] args) {
        Triple<String, Integer, Boolean> userStatus = new Triple<>("Jan Kowalski", 28, true);
        String name = userStatus.getFirst();
        int age = userStatus.getSecond();
        boolean isActive = userStatus.getThird();
        System.out.println("Użytkownik: " + name + " (Wiek: " + age + "), Aktywny: " + isActive);
    }
}
