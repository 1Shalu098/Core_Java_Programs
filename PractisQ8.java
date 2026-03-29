import java.util.Scanner;

public class PractisQ8 {
 public static void main(String[] args) {
    // fibnaci series 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num = ");
    int n = sc.nextInt();
    int a = 0;
    int b =1;
    int sum;
    for(int i =0; i<=n-1; i++){
        System.out.print(a+" ");

        sum = a+b;
        a=b;
        b=sum;
       
    }
 }
}
