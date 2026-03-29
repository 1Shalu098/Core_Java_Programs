import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operater : ");
        String operater = sc.next();
        int ans = 0;
        switch (operater) {
            case "+" -> {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ans = a + b;
                break;
            }
            case "-" -> {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ans = a - b;
                break;
            }
            case "*" -> {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ans = a * b;
                break;
            }
            case "/" -> {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ans = a / b;
                break;
            }

        }
        System.out.println(ans);
    }
}
