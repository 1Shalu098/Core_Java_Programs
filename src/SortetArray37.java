public class SortetArray37 {
    public static void main(String[] args) {
        int  arr[] = {1,2,3,4,5};
        boolean issortest = true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] > arr[i+1]){
                issortest = false;
                break;
            }

        }
        System.out.println(issortest ? "yes":"no");
    }
}
