import java.util.ArrayList;

public class ArraylistSum1 {
    public static boolean Sumpair( ArrayList<Integer> list, int terget){
        int bp = -1;
        int n = list.size();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)> list.get(i+1)){
                bp= i;
                break;
            }
        }
        int lp =bp+1;
        int rp = bp;
        while (lp<rp){
            if (list.get(lp)+list.get(rp)==terget){
                return true;
            }
            if (list.get(lp)+list.get(rp)<terget){
                lp = (lp=1)%n;
            }else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11 15 6 8 9 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(Sumpair(list, 100));
    }
}
