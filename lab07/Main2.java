public class Main2 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123-456-789", 1000);
        System.out.println("Pierwotne konto: " + acc1);
        BankAccount acc2 = acc1.withInterest(10);
        System.out.println("Konto po dodaniu 10% odsetek: " + acc2);
        BankAccount acc3 = acc2.withInterest(5);
        System.out.println("Konto po dodaniu kolejnych 5%: " + acc3);
    }
}
