import java.util.Arrays;

public class Arrayreverse {
    //reverse arry
    public static int reverse (int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
           int temp = arr[end];
                arr [end]= arr[start];
                arr[start] = temp;
                start++;
                end--;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        reverse(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]);
        // }
        System.out.println(Arrays.toString(arr));
    }
}
    

