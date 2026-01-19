import java.util.PriorityQueue;
public class zad9 {
    public static <T> PriorityQueue<T> mergePriorityQueues(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {
        PriorityQueue<T> mergedQueue = new PriorityQueue<>(queue1.comparator());
        mergedQueue.addAll(queue1);
        mergedQueue.addAll(queue2);
        return mergedQueue;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(30);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(20);
        pq2.add(5);
        PriorityQueue<Integer> result = mergePriorityQueues(pq1, pq2);
        System.out.println("Połączona kolejka (pobieranie elementów): ");
        while (!result.isEmpty())
        {
            System.out.print(result.poll() + " ");
        }
    }
}
