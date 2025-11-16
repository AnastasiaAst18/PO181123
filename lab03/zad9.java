import java.util.Scanner;

public class zad9 {
    public int obliczSume(int a, int b)
    {
        if (!sprawdzDane(a, b))
        {
            System.out.println("Nie można obliczyć sumy - liczby muszą być dodatnie.");
            return 0;
        }
        int suma = a + b;
        System.out.println("Suma liczb: " + suma);
        return suma;
    }
    private boolean sprawdzDane(int a, int b)
    {
        if (a < 0 || b < 0)
        {
            System.out.println("Bład.");
            return false;
        }
        return true;
    }
    public static void  main(String[] args)
    {
        zad9 kalkulator = new zad9();
        kalkulator.obliczSume(10, 5);
        kalkulator.obliczSume(7, -3);
    }
}
