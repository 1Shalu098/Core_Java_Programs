import java.util.Scanner;

public class Strrig_count51 {
    // count vowels ,consonant and space
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowel =0, consonant =0, space =0;
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                        vowel++;
                    }
                    case ' ' -> space++;
                    default -> consonant++;
                }
            }
        }
        System.out.println("count of vowel "+ vowel);
        System.out.println("count of consonate "+consonant);
        System.out.println("count of space "+space);
    }
}
