import java.util.Arrays;

public class ArrayDeepCopy38 {
    public static void main(String[] args) {
        int arr[] = {1, 2,  3, 4, 5};
        int temp[] = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            temp[i] = arr[i];
        }
//        for (int i= 0; i<arr.length; i++){
//            System.out.print(temp[i] +" ");
//        }
       System.out.println(Arrays.toString(temp));
    }
}
