import books.Book;
import library.Shelf;
public class TestLibrary {
    public static void main(String[] args)
    {
        Shelf shelf = new Shelf();
        Book b1 = new Book("Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("Dziady", "Adam Mickiewicz", 1823);
        Book b3 = new Book("Pan Tadeusz", "Adam Mickiewicz", 1834);
        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);
        shelf.printShelf();
        shelf.removeBook(b2);
        System.out.println("Po usunięciu jednej książki: ");
        shelf.printShelf();
    }
}
