import java.util.ArrayList;
import java.util.List;

public class zad5 {
    public static void main(String[] args) {
        List<LoudAnimal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        System.out.println("Zwierzęta zaczynają hałasować: ");
        for (LoudAnimal a : animals) {
            a.makeNoise();
        }
    }
}
