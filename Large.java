public class Large {
    // find largest value
//   find smallest
public static int largestvalue(int arr[]){
    int max =0;
    int small= Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
        if(max<arr[i]){
            max = arr[i];
        }
        if (small>arr[i]) {
            small = arr[i];
        }
    }System.out.println(small);
    return max;
}
public static void main(String[] args) {
    int arr[] ={2,4,3,4,54,3,5,1,6};
    System.out.println(largestvalue(arr));
}
}