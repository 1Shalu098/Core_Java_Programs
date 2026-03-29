public class PatternLAtter {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        for (char i =1; i <=n; i++) {
            for (char j =1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
