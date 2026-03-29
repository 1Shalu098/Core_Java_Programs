import java.util.Arrays;

public class ReverseArry {
    public static void main(String[] args) {
        
    
    int arr[] = {2, 3, 4, 5, 6};
    int i = arr.length-1;
    int temp[] = new int[arr.length];
    for (int j=0; j<temp.length; j++)  {
        temp[j] = arr[i];
        i--;
    } 
    System.out.print(Arrays.toString(temp));
    }
    // int arr[] = {1, 2, 3, 4, 5};
    // int i = arr.length - 1;
    // int temp[] = new int[arr.length];
    // for (int j = 0; j < temp.length; j++) {
    //     temp[j] = arr[i];
    //     i--;

    // }
    // System.out.println(Arrays.toString(temp));
}
