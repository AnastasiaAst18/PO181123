import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

class OrderDateComparator implements Comparator<Order>
{
    @Override
    public int compare(Order o1, Order o2)
    {
        return o1.getOrderDate().compareTo(o2.getOrderDate());
    }
}
class CustomerNameComparator implements Comparator<Order>
{
    @Override
    public int compare(Order o1, Order o2)
    {
        return o1.getCustomerName().compareTo(o2.getCustomerName());
    }
}
public class zad4 {
    public static void main(String[] args)
    {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Zygmunt", LocalDate.of(2025, 1, 10)));
        orders.add(new Order(2, "Adam", LocalDate.of(2025, 1, 15)));
        orders.add(new Order(3, "Barbara", LocalDate.of(2025, 1, 10)));
        orders.add(new Order(4, "Cezary", LocalDate.of(2025, 1, 12)));
        orders.add(new Order(5, "Anna", LocalDate.of(2025, 1, 10)));
        OrderDateComparator dateComp =  new OrderDateComparator();
        CustomerNameComparator nameComp =  new CustomerNameComparator();
        orders.sort(dateComp.thenComparing(nameComp));
        System.out.println("Posortowane zamówienia (Data rosnąco -> Klient A-Z): ");
        for (Order o : orders)
        {
            System.out.println(o);
        }
    }
}
