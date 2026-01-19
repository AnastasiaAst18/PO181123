import java.util.LinkedList;
import java.util.Queue;
public class zad7 {
    public static <T> void reverseQueue(Queue<T> queue)
    {
        if (queue.isEmpty()){
            return;
        }
        T element = queue.poll();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Przed: " + q);
        reverseQueue(q);
        System.out.println("Po: " + q);
    }
}
