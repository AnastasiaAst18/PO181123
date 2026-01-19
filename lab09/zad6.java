public class zad6 {
    public static void main(String[] args)
    {
        Tree[] forest =
                {
                        new Tree("Sosna", 15.5),
                        new Tree("Dąb", 22.0),
                        new Tree("Świerk", 12.3)
                };
        Pair<Tree> treeResult = new Pair<>();
        ForestryUtils.findMinMaxHeight(forest, treeResult);
        System.out.println("Najniższe: " + treeResult.getFirst());
        Pair<Plant> plantResult = new Pair<>();
        ForestryUtils.findMinMaxHeight(forest, plantResult);
        System.out.println("Najwyższe (jako roślina): " + plantResult.getSecond());
    }
}
