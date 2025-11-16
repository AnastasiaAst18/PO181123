public class Saw extends WorkTool{
    public Saw(String name, int productionYear)
    {
        super(name, productionYear);
    }
    public void use()
    {
        System.out.println("Using saw " + name + " to cut wood.");
    }
}
