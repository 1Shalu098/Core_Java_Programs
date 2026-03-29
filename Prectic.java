public class Prectic {
    public static void main(String[] args) {
        int n =36;
        int n2 = 60;
        int temp = 1;
        
        for(int i =1; i<=n && i<=n2; i++){
            if (n%i==0 && n2%i==0) {
                temp=i;
                
            }
        }
        System.out.println(temp);
    }
    
}
