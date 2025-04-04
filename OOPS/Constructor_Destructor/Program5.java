package OOPS.Constructor_Destructor;

/*5. Constructor Calling Another Constructor
Define a class Employee with name and salary.
Use this() inside a constructor to call another constructor in the same class.
 * 
 */
class Employees{
    String name;
    float salary;
    
    Employees(){
        this("Unknown",0);
        System.out.println("Default Constructor");
    }
    
    Employees(String a , float s){
        name = a;
        salary = s;
        
        System.out.println("Parameterized Constrctor");
    }
    
    void display(){
        System.out.println("Name :  " +name);
        System.out.println("Salary:  " +salary);
    }
}
public class Program5{
    public static void main(String[] args){
        Employees emp1 = new Employees();
        emp1.display();
        
        Employees emp2 = new Employees("Dhanya",230000);
        emp2.display();
    }
}

/*
 * Parameterized Constrctor
Default Constructor
Name :  Unknown
Salary:  0.0
Parameterized Constrctor
Name :  Dhanya
Salary:  230000.0
 */