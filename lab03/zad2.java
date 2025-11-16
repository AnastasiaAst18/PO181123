public class zad2 {
    double x;
    double y;
    public zad2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double distance(zad2 otherPoint)
    {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static  void main(String[] args)
    {
        zad2 p1 = new zad2(2, 3);
        zad2 p2 = new zad2(7, 9);
        double odleglosc = p1.distance(p2);
        System.out.println("Punkt 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Punkt 2: (" + p2.x + ", " + p2.y + ")");
        System.out.println("Odległość między punktami: " +  odleglosc);
    }
}
