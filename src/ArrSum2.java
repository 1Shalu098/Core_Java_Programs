import java.util.Scanner;

public class ArrSum2 {
    public static void main(String[] args) {
        // sum of arry in second methode
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arry ");
        int size  = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i=0; i< arr.length; i++){
            System.out.println("enter element ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i< arr.length; i++){
            if (i==arr.length-1) System.out.print(arr[i]);
            else System.out.print(arr[i]+"+");

        }
        System.out.print("= "+sum);
    }
}
