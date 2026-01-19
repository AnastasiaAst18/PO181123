import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable <Product>{
    private String name;
    private double price;
    private LocalDate expirationDate;
    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }
    @Override
    public int compareTo(Product o) {
        int dateComparison = o.expirationDate.compareTo(this.expirationDate);
        if (dateComparison == 0)
        {
            return Double.compare(this.price, o.price);
        }
        return dateComparison;
    }
    @Override
    public String toString() {
        return String.format("Produkt: %-10s | Cena: %6.2f zł | Data ważności: %s",  name, price, expirationDate);
    }
}
public class zad2 {
    public static void main(String[] args)
    {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Chleb", 4.20, LocalDate.of(2024, 5, 15)));
        products.add(new Product("Mleko", 3.50, LocalDate.of(2024, 5, 20)));
        products.add(new Product("Ser", 12.00, LocalDate.of(2024, 6, 10)));
        products.add(new Product("Szynka", 15.50, LocalDate.of(2024, 5, 20)));
        products.add(new Product("Jogurt", 2.10, LocalDate.of(2024, 6, 1)));
        Collections.sort(products);
        System.out.println("Lista produktów posortowana według daty (desc) i ceny (asc): ");
        for (Product p : products)
        {
            System.out.println(p);
        }
    }
}
