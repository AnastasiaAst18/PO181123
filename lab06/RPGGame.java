import java.util.Arrays;
import java.util.Objects;
public class RPGGame extends ComputerGame{
    private String gameWorld;
    public RPGGame(String title, String producer, String gameWorld) {
        super(title, producer);
        this.gameWorld = gameWorld != null ? gameWorld : "";
    }
    public RPGGame(String title, String producer, double[] ratings, String gameWorld) {
        super(title, producer, ratings);
        this.gameWorld = gameWorld != null ? gameWorld : "";
    }
    public String getGameWorld() {
        return gameWorld;
    }
    public void setGameWorld(String gameWorld) {
        this.gameWorld = gameWorld != null ? gameWorld : "";
    }
    @Override
    public String toString() {
        return super.toString() + "\n GameWorld: " + gameWorld;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        RPGGame other = (RPGGame) obj;
        return Objects.equals(gameWorld, other.gameWorld);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gameWorld);
    }
}
