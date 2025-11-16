public class Screwdriver extends WorkTool{
    public Screwdriver(String name, int productionYear)
    {
        super(name, productionYear);
    }
    public void use()
    {
        System.out.println("Using screwdriver " + name + " to tighten screws.");
    }
}
