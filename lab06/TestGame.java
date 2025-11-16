public class TestGame {
    public static void main(String[] args) {
        ComputerGame game1 = new ComputerGame("StarCraft", "Blizzard");
        game1.addRating(9.5);
        game1.addRating(8.7);
        game1.removeRating(0);
        System.out.println(game1);
        RPGGame rpg1 = new RPGGame("Witcher 3", "CD Projekt", new double[]{10, 9.7}, "The Continent");
        RPGGame rpg2 = new RPGGame("Witcher 3", "CD Projekt", new double[]{10, 9.7}, "The Continent");
        System.out.println(rpg1);
        System.out.println("rpg1 equals rpg2? " + rpg1.equals(rpg2));
        System.out.println("game1 equals rpg1? " + game1.equals(rpg1));
        System.out.println("rpg1 hashCode: " + rpg1.hashCode());
        System.out.println("rpg2 hashCode: " + rpg2.hashCode());
    }
}
