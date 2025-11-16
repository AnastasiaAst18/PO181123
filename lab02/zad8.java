public class zad8 {
    public static String zamienPierwszaIOstatnia(String tekst)
    {
        if (tekst == null || tekst.length() < 2)
        {
            return tekst;
        }
        char pierwszy = tekst.charAt(0);
        char ostatni = tekst.charAt(tekst.length() - 1);
        String srodek = tekst.substring(1, tekst.length() - 1);
        return ostatni + srodek + pierwszy;
    }
    public  static void main(String[] args)
    {
        String napis1 = "Programowanie";
        String napis2 = "Java";
        String napis3 = "A";
        String napis4 = "Test";
        System.out.println("Oryginał: " + napis1 + " -> Po zamianie: " + zamienPierwszaIOstatnia(napis1));
        System.out.println("Oyginał: " + napis2 + " -> Po zamianie: " + zamienPierwszaIOstatnia(napis2));
        System.out.println("Oryginał: " + napis3 + " -> Po zamianie: " + zamienPierwszaIOstatnia(napis3));
        System.out.println("Oryginał: " + napis4 + " -> Po zamianie: " + zamienPierwszaIOstatnia(napis4));
    }
}
