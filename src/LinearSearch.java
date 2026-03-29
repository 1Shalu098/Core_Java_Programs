public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 4;
        int largest = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] ==key){
                largest = i;
            }
        }
        System.out.println(largest);
    }

}
