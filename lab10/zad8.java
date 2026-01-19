import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
public class zad8 {
    public static <T> boolean isSymmetric(Deque<T> deque)
    {
        if (deque.size() <= 1) return true;
        Object[] elements = deque.toArray();
        int left = 0;
        int right = elements.length - 1;
        while (left < right)
        {
            if (!Objects.equals(elements[left], elements[right]))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
