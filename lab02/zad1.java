public class zad1 {
    public static int znajdzNajwiekszaPierwsza(int n)
    {
        if (n <= 2)
        {
            throw new IllegalArgumentException("n musi być większe niż 2");
        }
        for (int i = n - 1; i >= 2; i--)
        {
            if (czyPierwsza(i))
            {
                return i;
            }
        }
        return -1;
    }
    public static boolean czyPierwsza(int liczba)
    {
        if (liczba < 2) return false;
        for (int i = 2; i * i <= liczba; i++)
        {
            if (liczba % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int n = 10;
        int wynik = znajdzNajwiekszaPierwsza(n);
        System.out.println("Wynik: " + wynik);
    }
}
