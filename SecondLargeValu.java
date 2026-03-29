public class SecondLargeValu {
    public static void main(String[] args) {
       // second large value
        int arr[] = {1, 8, 2, 6};
        int max = Math.max(arr[0], arr[1]);
        int smax = Math.min(arr[0], arr[1]);
        for(int i=2; i<arr.length; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }else if (arr[i]>smax) {
                smax =arr[i];
                
            }
        }
        System.out.println(smax);
    }
    
}
