public class zad5 {
    String title;
    String author;
    int publicationYear;
    public zad5()
    {
        title = "Nieznany tytuł";
        author = "Nieznany author";
        publicationYear = 0;
    }
    public zad5(String title, String author, int publicationYear)
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public void displayInfo()
    {
        System.out.println("Tytuł: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Rok wydania: " + publicationYear);
        System.out.println();
    }
    public  static void main(String[] args)
    {
        zad5 defaultBook = new zad5();
        System.out.println("Książka utworzona konstruktorem domyśłnym.");
        defaultBook.displayInfo();
        zad5 customBook = new zad5("Pan Tadeusz", "Adam Mickiewicz", 1834);
        System.out.println("Kiążka utworzona konstruktorem z argumentami.");
        customBook.displayInfo();
    }
}
