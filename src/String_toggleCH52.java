import java.util.Scanner;

public class String_toggleCH52 {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        String ans = "";
        String s = sc.nextLine();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch>='A'&& ch<='Z'){
                ans = ans+(char)(ch+32);
            } else if (ch>='a' && ch<='z') {
                ans = ans + (char)(ch-32);

            }

        }
        System.out.println(ans);
     */
    // second method
        Scanner sc = new Scanner(System.in);
        String ans = "";
        String s = sc.nextLine();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                ans = ans+Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                ans = ans+ Character.toUpperCase(ch);
            }

        }
        System.out.println(ans);
    }
}
