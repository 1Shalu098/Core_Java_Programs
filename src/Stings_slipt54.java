import java.util.Scanner;

public class Stings_slipt54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine();
        String arrStr[] = sentance.split(" ");
        for (int i = 0; i <arrStr.length ; i++) {
            String world = arrStr[i];
            System.out.println(Character.toUpperCase(world.charAt(0))+ world.substring(1));

        }
    }
}