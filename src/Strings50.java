import java.util.Scanner;

public class Strings50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean palindromic = true;
       int i =0 , j= s.length()-1;
       while (i<j){
           if (s.charAt(i) != s.charAt(j)){
               palindromic = false;
           }
           i++;
           j--;
       }

        System.out.println(palindromic);
    }
}
