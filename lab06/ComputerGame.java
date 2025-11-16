import java.util.Arrays;
import java.util.Objects;
public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;
    public ComputerGame(String title, String producer) {
        this.title = title != null ? title : "";
        this.producer = producer != null ? producer : "";
        this.ratings = new double[0];
    }
    public ComputerGame(String title, String producer, double[] ratings) {
        this(title, producer);
        this.ratings = ratings != null ? Arrays.copyOf(ratings, ratings.length) : new double[0];
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title != null ? title : "";
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer != null ? producer : "";
    }
    public double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }
    public void addRating(double rating) {
        if (rating < 0 || rating > 10) return;
        double[] newRatings = Arrays.copyOf(ratings, ratings.length + 1);
        newRatings[newRatings.length - 1] = rating;
        ratings = newRatings;
    }
    public void removeRating(int index) {
        if (index < 0 || index >= ratings.length) return;
        double[] newRatings = new double[ratings.length - 1];
        for (int i = 0, j = 0; i < ratings.length; i++)
        {
            if (i != index)
            {
                newRatings[j++] = ratings[i];
            }
        }
        ratings = newRatings;
    }
    @Override
    public String toString() {
        return "ComputerGame: " + title + "\nProducer: " +  producer + "\nRatings: " + Arrays.toString(ratings);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComputerGame other = (ComputerGame) obj;
        return Objects.equals(title, other.title) &&
                Objects.equals(producer, other.producer) &&
                Arrays.equals(ratings, other.ratings);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(title, producer);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}
