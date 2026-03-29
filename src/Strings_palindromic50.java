import java.util.Scanner;

public class Strings_palindromic50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ispalindromic = true;
        int i = 0, j = s.length()-1;
        while (i<j){
            if (s.charAt(i) !=s.charAt(j)){
                ispalindromic = false;
                break;

            }
            i++; j--;
        }
        if (ispalindromic) System.out.println("is palindromic");
        else System.out.println("not palindromic");
    }
}
