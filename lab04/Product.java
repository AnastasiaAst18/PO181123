public class Product {
    public static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 5;
    public Product()
    {
        if (numberOfProducts < MAX_PRODUCTS)
        {
            numberOfProducts++;
            System.out.println("Utworzono nowy produkt. Liczba produktów: " + numberOfProducts);
        }
        else
        {
            System.out.println("Osiągnięto limit produktów: " +  MAX_PRODUCTS);
        }
    }
}
