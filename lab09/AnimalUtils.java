public class AnimalUtils {
    public static <T extends Animal> T findMax(T element1, T element2)
    {
        if (element1.compareTo(element2) >= 0)
        {
            return element1;
        }
        else {
            return element2;
        }
    }
}
