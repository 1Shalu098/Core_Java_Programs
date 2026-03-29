public class Arry_Gretest {
    public static void main(String[] args) {
       // int arr[] = {10, 5, 2, 37, 8};
        int arr[] = {1,8,2,6};
        int max = 0;
        for (int i= 0; i< arr.length; i++){

            if (arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println(max);
    }
}
