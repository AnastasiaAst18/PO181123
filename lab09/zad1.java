import javax.swing.*;

public class zad1 {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.set("Jan Kowalski");
        String name = nameBox.get();
        System.out.println("Zawartość nameBox: " + name);
        Box<Integer> numberBox = new Box<>();
        numberBox.set(123);
        int number = numberBox.get();
        System.out.println("Zawartość numberBox: " + number);
    }
}
