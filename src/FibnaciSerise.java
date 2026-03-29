import java.util.Scanner;

public class FibnaciSerise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 1; i <=n ; i++) {
            sum += a;
            System.out.print(a+" ");
            int fib = a+b;
            a = b;
            b = fib;
        }
        System.out.println();
       System.out.println(sum);
    }
}
