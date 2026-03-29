public class PracticArray18 {
    public static int findMax(int arr[], int n){
        int max = arr[0] , index =0;
        for (int i =0; i <n ; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr [] = {2,3,5,4,1};
        int n = arr.length;
        int index = findMax(arr , n);
        int c  = 1;
        while (index != 0){
            index = findMax(arr ,index);
            c++;
        }
        System.out.println(c);
    }
}
