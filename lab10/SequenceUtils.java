import java.util.Deque;
import java.util.LinkedList;

public class SequenceUtils {
    public static void reversePrint(Iterable<?> items) {
        if (items == null)
        {
            System.out.println("Przekazany argument to null.");
            return;
        }
        Deque<Object> stack = new LinkedList<>();
        for (Object item : items) {
            stack.push(item);
        }
        System.out.println("Elementy w odwrotnej kolejności: ");
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
