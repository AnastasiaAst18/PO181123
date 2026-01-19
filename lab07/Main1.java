public class Main1 {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Dune", "Frank Herbert", 50, 1965);
        BookDTO book2 = new BookDTO("The Hobbit", "J.R.R. Tolkien", 60, 1937);
        BookDTO book3 = new BookDTO("Clean Code", "Robert C. Martin", 80, 2008);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
