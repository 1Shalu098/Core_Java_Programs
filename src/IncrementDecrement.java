public class IncrementDecrement {
    public static void main(String[] args) {
      /*  int a = 11;
        int b= 22,c;
        c = a+b + a++ + b++ + ++a +  ++b;
        System.out.println("a =" +a);
        System.out.println("b =" +b);
        System.out.println("c = " +c);
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(ch1++ + ch2++);
        int i = 11;
        i = i++ + ++i;
        System.out.println(i++);

        int a=1;

        a = a++ + ++a * --a - a--;

        System.out.println(a);*/
        int m=1010, n=1010;

        System.out.println(m++ / ++n * n-- / --m);
        char ch = "123".charAt(1);

        System.out.println(ch++ + ++ch);
    }
}
