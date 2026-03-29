import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i=0; i<arr.length; i++){
           // System.out.println("Enter array elemet");
             arr[i] = sc.nextInt();
             sum +=arr[i];
        }
        System.out.println(sum);
        System.out.println((float) sum/size);
    }
}
