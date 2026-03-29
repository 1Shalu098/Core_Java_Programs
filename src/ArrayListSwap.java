import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(5);
            list.add(9);
            list.add(3);
            list.add(6);
            // swap two number
//        int indx1 = 1, indx2 =3;
//        System.out.println(list);
//            int temp = list.get(indx1);
//            list.set(indx1, list.get(indx2));
//            list.set(indx2, temp);
//        System.out.println(list);

        // sort Arraylist
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
