import java.util.Scanner;

public class SumArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        int sum =0;
        for (int i=0; i<= args.length; i++){
            System.out.println("Enter arr ");
            arr [i] = sc.nextInt();
            sum +=arr[i];
        }
        for (int i =0; i< arr.length; i++){
            if(i== args.length-1) System.out.println(arr[i]);
        }
        System.out.println("sum = "+sum);
    }

}
