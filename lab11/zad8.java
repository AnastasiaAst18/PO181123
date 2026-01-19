@FunctionalInterface
interface Calculator
{
    int calculate(int a, int b);
}
public class zad8
{
    public static void main(String[] args)
    {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        int x = 10;
        int y = 5;
        System.out.println("Dodawanie: " + x + " + " + y + " = " + add.calculate(x, y));
        System.out.println("Dodawanie: " + x + " * " + y + " = " + multiply.calculate(x, y));
    }
}
