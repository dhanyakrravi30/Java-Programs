package OOPS.Constructor_Destructor;
class Person{
    String name;
    int age;
    
    Person(){
        System.out.println("Constructor Example");
        name = "Dhanya";
        age = 21;
    }
    
    void display(){
        System.out.println("Name:  " + name);
        System.out.println("Age: " + age);
    }
}
public class Constructor {
     public static void main(String[] args){
         Person p1 = new Person();
         p1.display();
     }
}

/*
 * Constructor Example
Name:  Dhanya
Age: 21
 */