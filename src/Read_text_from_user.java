import java.util.Scanner;

public class Read_text_from_user {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("your name : ");
        String name = sc.nextLine();
        System.out.print("your age : ");
        int age = sc.nextInt();
        System.out.println("Hello "+name+" you are  "+ age+" years old.");

    }

}
