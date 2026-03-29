import java.util.Scanner;
// swap two number
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        System.out.println("swap se pehle");
        System.out.println("a =" +a);
        System.out.println("b =" +b);
        int tem = a;
         a = b;
         b = tem;
        System.out.println("swap ke bade");
        System.out.println("a ="+a);
        System.out.println("b = "+b);
    }
}
