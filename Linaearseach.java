public class Linaearseach {
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,6,75,6,7};
        int key = 4;
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                index =i;
                
            }
            
        }
        System.out.println(index);
    }
    
}
