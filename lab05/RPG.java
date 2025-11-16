public class RPG extends Game{
    private String characterName;
    public RPG(String gameName, String characterName) {
        super(gameName);
        this.characterName = characterName;
        System.out.println("Creating RPG character: " + this.characterName);
    }
}
