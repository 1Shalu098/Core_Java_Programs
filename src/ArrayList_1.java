import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        // Array list define
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        // add element in array list
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.add(1,2);
        System.out.println(list);

        // get operation
        // chek index element
        int element = list.get(2);
        System.out.println(element);
        // remove operation
        // delete element
        list.remove(3);
        System.out.println(list);
        // set element
        list.set(3,5);
        System.out.println(list);
        // contains operation
        // chek element of array
        // chek elemnt array me hai ki nahi
        System.out.println(list.contains(4));
        System.out.println(list.contains(2));
        // itret
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) +" ");

        }
    }
}
