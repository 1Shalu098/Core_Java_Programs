public class Linearsearch41 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int key = 4;
        int index = -1;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==key){
                index = i;
                break;
            }

        }
        System.out.println(index);
    }
}
