public class SubArrays {
    // sub arry in java
    public static void subarry(int arr[]){
        int tp = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array = "+ tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subarry(arr);
    }
    
}
