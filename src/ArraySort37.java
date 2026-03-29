public class ArraySort37 {
    public static void main(String[] args) {
        // checked arrr sorted hai ya nhi
        int arr[] = {1, 2, 3, 4, 5};
        boolean s = true;
        for (int i= 0; i<arr.length-1; i++ ){
            if (arr[i]>arr[i+1]) {
                s = false;
                break;
            }
        }
        System.out.println(s);
    }
}
