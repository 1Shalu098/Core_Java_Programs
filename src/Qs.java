import java.util.Scanner;

public class Qs {
    public static void main(String[] args) {
        //Write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max > arr[i]) {
                max = arr[i];
                index = i;
            }
           // System.out.println("Max element = " + max + " found at index " + index);
        }
        System.out.println("Max element = " + max + " found at index " + index);
    }
}
