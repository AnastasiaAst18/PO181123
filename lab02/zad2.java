public class zad2 {
    public static double siedemDoMinusN(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("n musi byc dodatnie.");
        }
        double potega = 1.0;
        for (int i = 0; i < n; i++)
        {
            potega = potega * 7;
        }
        return 1.0 / potega;
    }
    public static void main(String[] args)
    {
        int n = 4;
        double wynik = siedemDoMinusN(n);
        System.out.println("7^(-" + n + ") = " + wynik);
    }
}
