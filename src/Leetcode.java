import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
//        int n = 2923;
//
//        int arr [] = new int[4];
//        for (int i = 0; i <= arr.length-1; i++) {
//            arr[i] = n%10;
//            n = n/10;
        //   }
        // Arrays.sort(arr);
        // int new1 = (arr[0]*10)+arr[2];
        // int new2 = (arr[1]*10)+arr[3];
//      for (int i = 0; i <= arr.length-1; i++) {
//           System.out.print(arr[i]+" ");
//       }
        // System.out.println(new1+" "+new2);

        /*
         for(int i=0; i<n; i++){
        for (int j=i; j<n; j++){
            if(nums[i]%2==0 && nums[j]%2==0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums [j] = temp;
            }
        else if(nums[i]%2!=0&& nums[j]%2!=0){
            int temp1 = nums[i];
            nums[i] = nums[j];
            nums[j] = temp1;
        }
      }
       }
       return nums;
         */
//        // q 2278
//        String s= "foobar";
//        char target = 'o';
//        int n = s.length();
//        int count =0;
//        for (int i = 0; i <n; i++) {
//            if (s.charAt(i)==target){
//                count++;
//            }
//        }
//      int  pr = (count*100)/n;
//        System.out.println(count);
//        System.out.println(pr);
        // leetcode  q   81
        int nums [] = {1,2,3,4,5,6};
        int target = 5;
        rrr(nums, target);
    }

    public static boolean rrr(int nums[], int target) {
        int i = 0;
        // int n = nums.length-1;
        while (i < nums.length - 1) {
            int st = 0, ed = nums.length - 1;
            int mid = st + (ed - st) / 2;
            if (mid == target) {
                return true;
            } else if (mid < target) {
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
            i++;
        }
        return false;
    }
}