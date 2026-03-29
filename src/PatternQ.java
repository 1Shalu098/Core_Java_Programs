public class PatternQ {
    public static void hollo_ractangal(int r, int k){
        for (int i =1; i <=r; i++) {

            for (int j = 1; j <=k; j++) {

                if (i==1 || i==r || j==1|| j==k){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void half_primid(int n){
        for (int i=1; i<=n; i++){
            for (int j =1; j <=n-i; j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <=i; k++) {
                    System.out.print("*");

                }

            System.out.println();
        }
    }
    public static void half_primideWith_number(int n){
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=(n-i)+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyd_Tringle(int n){
        int counter = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <i ; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void tringle(int n){
        // 0 1 tringle
        for (int i =1; i <=n ; i++) {
            for (int j =1; j <=i ; j++) {
                if ((i+j)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void ButterFly(int n){
        for (int i =1; i<=n; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j =1; j <2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n; i >=1 ; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidRhombuse(int n){
        for (int i =1; i <=n ; i++) {
            for (int j =1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_rhombus(int n){
        for (int i =1; i <=n ; i++) {
            for (int j =1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n; j++) {

                if (i==1 || i==n || j==1|| j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void dimond(int n){
        for (int i =1; i <=n ; i++) {
            for (int j =1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n; i >=1 ; i--) {
            for (int j =1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void NumberPrimide(int n){
        for (int i =1; i<=n; i++){
            for (int j =1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j<=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
   // ButterFly(7);
       // solidRhombuse(9);
      //  Hollow_rhombus(7);
       // dimond(10);
        NumberPrimide(8);
    }
}
