
import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        double principle = sc.nextDouble();
        System.out.println("Enter the rete of interest in % : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period in year : ");
        double time = sc.nextDouble();
        double amount = principle * Math.pow(1+rate / 100, time );
        double compountInterest = amount-principle;
        System.out.println("compound Interst "+ compountInterest);
    }
}
