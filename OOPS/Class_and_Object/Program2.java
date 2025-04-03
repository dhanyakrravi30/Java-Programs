/*
 * 2. Student Information System
Create a class Student with name, rollNumber, and grade.

Create multiple objects and display their details.
 */


 class Student{
    String name;
    int rollno;
    char grade;
    
    void display(){
        System.out.println("Name :  " +name);
        System.out.println("Rollno: " +rollno);
        System.out.println("Grade: " +grade);
        System.out.println("------------");
    }
}
public class Program2 {
     public static void main(String[] args){
         Student s1 = new Student();
         Student s2 = new Student();
         
         s1.name = "Dhanya";
         s1.rollno = 124;
         s1.grade = 'A';
         
         
         s2.name = "Venkatesh";
         s2.rollno = 123;
         s2.grade = 'B';
         
         s1.display();
         s2.display();
     }
}
