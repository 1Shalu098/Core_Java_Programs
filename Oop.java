public class Oop {
    public static void main(String[] args) {
Fish s1 = new Fish();
       s1.eat();
    }
    }
    
// } 
// class student{
//     String name; 
//     int age;
//     student( String name, int age){
//        // System.out.println("call the constructure");
//     }
// }

// Inheritence 

// base class 
class Animal{
    String name;
    void eat(){
        System.out.println(" making fish");
    }
    void fish(){
        System.out.println(" dolphine fish");
    }
}

// drive class // subclass
class Fish extends Animal{
 void swip(){
    System.out.println("Animal name");
 }
}

