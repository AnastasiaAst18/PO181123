import java.util.LinkedList;
import java.util.ListIterator;

public class ListU {
    public static <T> boolean isPalindrome(LinkedList<T> list) {
        if (list == null) return false;
        if (list.size() <= 1)  return true;
        ListIterator<T> forward = list.listIterator();
        ListIterator<T> backward = list.listIterator(list.size());
        for (int i = 0; i < list.size() / 2; i++) {
            T startElement = forward.next();
            T endElement = backward.previous();
            if (startElement == null)
            {
                if (endElement != null)
                {
                    return false;
                }

            } else if (!startElement.equals(endElement))
                    return false;
        }
        return true;
    }
}
