public class TestProduct {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++)
        {
            new Product();
        }
        System.out.println("Łącznie powstało: " + Product.numberOfProducts);
    }
}
