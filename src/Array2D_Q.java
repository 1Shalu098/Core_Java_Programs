public class Array2D_Q {
    // sum of matrix in x rule
    public static void main(String[] args) {
        int sumleft =0, sumrigt =0;
        int arr[][] = {
                {1,2,4},
                {3,4,6},
                {2,4,6}
        };
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (i==j){
                    sumleft += arr[i][j];
                } if (i+j==arr.length-1) {
                    sumrigt += arr[i][j];
                }
            }
        }
        System.out.println("sumleft: "+sumleft + " sumright: "+sumrigt);
    }
}
