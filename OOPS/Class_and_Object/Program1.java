/*
1. Create a Simple Class
Create a class Person with attributes name and age.
Make an object, assign values, and display them.
*/

class Person{
    String name;
    int age;
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " +age);
    }
}
public class Program1 {
    public static void main(String[] args){
        Person p1 = new Person();
     
     p1.name = "Dhanya";
     p1.age= 20;
     
     p1.display();
    }
     
     
}
