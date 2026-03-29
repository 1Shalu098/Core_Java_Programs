import java.util.ArrayList;
// Q. check to terget number kya kisi pair ke addition ke equale hai

public class ArrayListSumPaier{
//     public static boolean pairSum(ArrayList<Integer> list  , int terget){
//         for (int i = 0; i < list.size() ; i++) {
//             for (int j = 0; j <list.size() ; j++) {
//                 if (list.get(i)+ list.get(j)==terget){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
    // 2 pointer opproach
public static boolean pairSum(ArrayList<Integer> list  , int terget){
    int lp = 0;
    int rp = list.size()-1;
    while (lp != rp){
        if (list.get(lp)+ list.get(rp)==terget){
            return true;
        }
        if (list.get(lp)+ list.get(rp) < terget){
            lp++;
        }else {
            rp--;
        }
    }
    return false;
}

    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        // 1 2 3 4 5 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list,22));

    }
}
