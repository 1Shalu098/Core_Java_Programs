public class Arry35 {
    public static void main(String[] args) {
        int arr[] = {1, 8, 2, 16};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
