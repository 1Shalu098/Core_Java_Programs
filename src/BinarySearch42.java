public class BinarySearch42 {
    public static int binarysearch(int arr[], int target){
        int start = 0, end =arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            int mid = start+(end-start)/2;
            if (arr[i]==target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else
                end = mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(binarysearch(arr,4));
//        int target = 4;
//        int index =0;
//        int start =0, end = arr.length-1;
//        for (int i = 0; i <arr.length ; i++) {
//            int mid = start+(end-start)/2;
//            if (arr[i]==target){
//                index = i;
//            }else if (arr[mid] < target){
//                start = mid+1;
//            }else {
//                end = mid-1;
//            }
//        }
//        System.out.println(index);
    }
}
