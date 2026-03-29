public class GretestArray35 {
    public static void main(String[] args) {
        int arr[] = {10,5,2,37,8};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (max<arr[i]){
                max =arr[i];
                index = i;
            }
        }
        System.out.println("gretest number = "+max + "  at index = "+index);
    }
}
