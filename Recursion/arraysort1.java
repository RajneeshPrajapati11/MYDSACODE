import java.util.*;

public class arraysort1 {

    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if (arr.size() == 1) {
            return arr;
        }

        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        arr = sort(arr);

        arr = insert(arr, temp);
        return arr;
    }

    public static ArrayList<Integer> insert(ArrayList<Integer> arr, int temp) {
        if (arr.size() == 0 || arr.get(arr.size() - 1) <= temp) {
            arr.add(temp);
            return arr;
        }

        int last = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        arr = insert(arr, temp);
        arr.add(last);

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 5, 2));
        arr = sort(arr);
        System.out.println(arr);
    }
}
