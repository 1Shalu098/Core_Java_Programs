public class Ps {
    public static void main(String[] args) {
        int n  = 50;
        for (int i= 2; i<=n/2; i++ ){
            while (i%2==0){
                System.out.println(i);
               n= n/i;

            }
        }
    }
}
