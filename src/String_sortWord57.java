import java.util.Scanner;

public class String_sortWord57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String sentence = sc.nextLine();
        String s = " hello world";
        String rev[] = s.split(" ");
        for (int i = 0; i < rev.length-1 ; i++) {
           // for (int j = 0; j < rev.length-1-i; j++) {
            for (int j= rev.length-1; j>=0; j--){
               // if (rev[j].compareTo(rev[j+1])>0){
                    String temp = rev[j];
                    rev[j] = rev[i];
                    rev[i] = temp;
               // }
                int  n = Integer.MAX_VALUE;
            }
        }
       // String ans = "";
        s = " ";
        for (int i = 0; i < rev.length ; i++) {
            s += rev[i]+" ";
        }
        System.out.println(s);
    }
}
