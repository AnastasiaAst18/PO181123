public class zad10 {
    public static void capitalizeEverySecond(StringBuffer tekst) {
        if (tekst == null || tekst.length() == 0)
        {
            return;
        }
        int licznikLitter = 0;
        for (int i = 0; i < tekst.length(); i++)
        {
            char znak = tekst.charAt(i);
            if (Character.isLetter(znak))
            {
                licznikLitter++;
                if (licznikLitter % 2 == 0)
                {
                    tekst.setCharAt(i, Character.toUpperCase(znak));
                }
                else
                {
                    tekst.setCharAt(i, Character.toLowerCase(znak));
                }
            }
        }
    }
    public static void main(String[] args)
    {
        StringBuffer tekst = new StringBuffer("programowanie w javie");
        System.out.print("Przed: " + tekst);
        capitalizeEverySecond(tekst);
        System.out.print("\nPo: " + tekst);
    }
}
