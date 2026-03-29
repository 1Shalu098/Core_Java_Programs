public class Hello {
    public static void main (String[] args){
        int m=1010, n=1010;
         
        System.out.println(m++ / ++n * n-- / --m);
        char ch = "123".charAt(1);

        System.out.println(ch++ + ++ch); 
    }
}