import java.util.Arrays;
import java.util.Scanner;

public class Sring_checkAnagrams {
    public static boolean anagram(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (anagram(s,t)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
