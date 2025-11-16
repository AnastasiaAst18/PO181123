public class Hammer extends WorkTool{
    public Hammer(String name, int productionYear) {
        super (name, productionYear);
    }
    public void use()
    {
        System.out.println("Using hammer " + name + " to hit nails.");
    }
}
