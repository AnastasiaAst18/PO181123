import java.util.ArrayList;
import java.util.Scanner;

public class zad7 {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> lista){
        ArrayList<Integer> odwrocona = new ArrayList<>();
        for(int i = lista.size() - 1; i >= 0; i--){
            odwrocona.add(lista.get(i));
        }
        return odwrocona;
    }
    public static void main(String args[]){
        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        System.out.println("Oryginalna lista: " + liczby);
        ArrayList<Integer> odwrocona = reverseArray(liczby);
        System.out.println("Odwrócona lista: " + odwrocona);
    }
}
