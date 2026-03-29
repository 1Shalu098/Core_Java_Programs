
public class PractisQ9 {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        //System.out.println("Enter num = ");
       // int n = sc.nextInt();
        int n=10, x = 4 , ans=0;
        for (int j = 1; j <=n; j++) {
            int count = 0;
            for(int i = 1; i<=j; i++){
                if(j%i==0){
                    count++;
                }
            
            }
            if(count==x){
                ans++;
            }
        }
          System.out.println(ans);
    }
    
}
