public class TestWorkTools {
    public static void main(String[] args)
    {
        WorkTool hammer = new Hammer("Stanley", 2018);
        WorkTool screwdriver = new Screwdriver("Bosch", 2020);
        WorkTool saw = new Saw("Makita", 2019);
        hammer.use();
        screwdriver.use();
        saw.use();
    }
}
