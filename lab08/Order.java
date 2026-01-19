import java.time.LocalDate;
import java.util.Comparator;

public class Order {
    private int id;
    private String customerName;
    private LocalDate orderDate;
    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }
    public String getCustomerName() {
        return customerName;
    }
    public LocalDate getOrderDate()
    {
        return orderDate;
    }
    @Override
    public String toString()
    {
        return String.format("Zamówienie nr %d | Data: %s | Klient: %s", id, orderDate, customerName);
    }
}
