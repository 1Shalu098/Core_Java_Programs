import java.util.Scanner;

public class String51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowel =0, consonents =0, space= 0;
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                        vowel++;
                    }
                    case ' ' -> {
                        space++;
                    }
                    default -> consonents++;
                }
            }
        }
        System.out.println("vowel: "+vowel+ " consonents: "+consonents+ " space: "+space);
    }
}
