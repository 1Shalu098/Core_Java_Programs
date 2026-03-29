import java.util.ArrayList;
// store the maximum water
public class Arraylist_StorWater {
//    public static int Storewatwe(ArrayList<Integer> heigth){
//        int maxwater =0;
//        for (int i = 0; i <heigth.size() ; i++) {
//            for (int j = 0; j < heigth.size() ; j++) {
//                int ht = Math.min(heigth.get(i),heigth.get(j));
//                int width = j-i;
//                int currentwater = ht*width;
//                maxwater = Math.max(maxwater , currentwater);
//            }
//        }
//        return maxwater;
//    }
    // 2 pointer aproch
    public static int Storewatwe(ArrayList<Integer>height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while (lp < rp){
            int ht = Math.min(height.get(lp),height.get(rp) );
            int width = rp-lp;
            int currentwater = ht*width;
            maxwater = Math.max(maxwater, currentwater);
            if (height.get(lp)<height.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(Storewatwe(height));
    }
}
