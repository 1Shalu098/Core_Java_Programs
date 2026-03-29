import java.util.Scanner;

public class Oop_student {
    String name;
    int age;
    long mob;
    public Oop_student (String name, int age ,long mob){
        this.name= name;
        this.age = age;
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Oop_student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mob=" + mob +
                '}';
    }
}
class Student1{
    public static void main(String[] args) {
        Oop_student studentDetail[] = new Oop_student[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter name ");
            String name = sc.nextLine();
            System.out.println("Enter age ");
            int age = sc.nextInt();
            System.out.println("Enter phone num ");
            long num = sc.nextLong();
            sc.nextLine();
            Oop_student s1 = new Oop_student(name, age, num);
            studentDetail[i] = s1;
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(studentDetail[i]);
        }
    }
}
