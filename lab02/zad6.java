import java.util.ArrayList;

public class zad6 {
    public static int minimumValue(ArrayList<int[]> listaTablic) {
        int min = Integer.MAX_VALUE;
        for (int[] tablica : listaTablic)
        {
            for (int liczba : tablica)
            {
                if (liczba < min)
                {
                    min = liczba;
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<int[]> lista = new ArrayList<>();
        lista.add(new int[]{5, 12, 3});
        lista.add(new int[]{7, -5, 9});
        lista.add(new int[]{8, 15, -2});
        int wynik =  minimumValue(lista);
        System.out.println("Najmniejsza liczba w liście tablicowej to: " + wynik);
    }
}
