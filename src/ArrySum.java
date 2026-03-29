import java.util.Scanner;

public class ArrySum {
    public static void main(String[] args) {
        // sum of Arry
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter Arry size ");
       // int size= sc.nextInt();
        int arr[]=  new int[]{23, 23, 23, 32, 32, 23};
        int sum = 0;
        for (int i=0; i<arr.length; i++){
//            System.out.println("Enter element");
//            arr[i]= sc.nextInt();
            sum+= arr[i];
        }


        System.out.println("sum of arr = "+sum);
    }
}
