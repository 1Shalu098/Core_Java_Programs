import java.lang.reflect.Array;
import java.util.Arrays;

public class Binarysearch {
    // binary search
    public static int binarysearch(int arr[], int target){
        int st =0 , end=arr.length-1;
        while (st<=end){
            int mid= st +(end-st)/2;
            if(arr[mid]==target) {
                return mid;
            }else if (arr[mid]<target) {
                st =mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return-1;
    }
  public static void main(String[] args) {
    int  arr[] = {12,33,43,34,45,56,5,23,34,34};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(binarysearch(arr, 23));
  }
}
