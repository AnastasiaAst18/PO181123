public class zad1 {
    abstract static class Shape
    {
        abstract double area();
    }
    public static void main(String[] args) {
        double width = 5.0;
        double height = 10.0;
        Shape rectangle = new Shape()
        {
            @Override
            double area()
            {
                return width * height;
            }
        };
        System.out.println("Pole prostokąta (klasa anonimowa): " + rectangle.area());
    }
}
