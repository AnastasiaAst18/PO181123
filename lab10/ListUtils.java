import java.util.ArrayList;

public class ListUtils
{
    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2)
    {
        int initialCapacity = 0;
        if (list1 != null)
        {
            initialCapacity += list1.size();
        }
        if (list2 != null)
        {
            initialCapacity += list2.size();
        }
        ArrayList<T> mergedList = new ArrayList<>(initialCapacity);
        if (list1 != null)
        {
            mergedList.addAll(list1);
        }
        if (list2 != null)
            {
            mergedList.addAll(list2);
            }
        return mergedList;
    }
}
