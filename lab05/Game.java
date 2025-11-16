public class Game {
    private String gameName;
    public Game(String gameName) {
        this.gameName = gameName;
        initialize();
    }
    public final void initialize() {
        System.out.println("Initializing game: " + gameName);
    }
}
