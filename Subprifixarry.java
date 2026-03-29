public class Subprifixarry {
    public static void Subprifix(int arr[]){
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        int prifix[] = new  int[arr.length];
        prifix[0] = arr[0];
         for(int  i=1; i<prifix.length; i++){
            prifix[i] = prifix[i-1]+arr[i];
         }
         for(int i=0; i<arr.length;i++){
            int start =i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currSum = start==0? prifix[end]: prifix[end]-prifix[start-1];
                if (maxSum<currSum) {
                    maxSum = currSum;
                    
                }
            }
         }
         System.out.println("max sum = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        Subprifix(arr);
    }
}
