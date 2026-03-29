import java.util.Scanner;

public class AreaCalculation11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shap: ");
        String shap = sc.nextLine();
        double Area = 0;
        switch (shap){
            case "tringle" -> {
                System.out.println("Enter base and height: ");
                int b = sc.nextInt();
                int h = sc.nextInt();
                Area = 0.5+b+h;
                break;
            }
            case "circle" ->{
                System.out.println("Enter radius : ");
                int r = sc.nextInt();
                Area = Math.PI*r*r;
                break;
            }
            case "rectangle" -> {
                System.out.println("Enter lenght and breath");
                int l = sc.nextInt();
                int b = sc.nextInt();
                Area = l*b;
                break;
            }
            default -> System.out.println("invoiled input");
        }
        System.out.println(Area);
    }
}
