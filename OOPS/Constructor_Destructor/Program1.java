/*
 * 1. Default Constructor
Create a class Person with attributes name and age.
Use a default constructor to assign default values and display them.
 */




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
public class Program1 {
     public static void main(String[] args){
         Person p1 = new Person();
         p1.display();
     }
}