public class Practic7 {
    public static void main(String[] args) {
        int n = 92;
        int sum = 0;
        for(int i=0; i<=n/2; i++){
            if(n%1==0){
                sum +=i;
            }
        }
        System.out.println(sum > n ? "Abundat number": "not Abubdat number");
    }
 }
