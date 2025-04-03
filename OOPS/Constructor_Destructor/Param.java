package Constructor_Destructor;

class Employee{
    String name;
    int id;
    String department;
    float salary;
    
    
    Employee(String n, int i, String dep, float sal){
        name = n;
        id = i;
        department = dep;
        salary = sal;
    }
    
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Id:  "+id);
        System.out.println("Department:  " +department);
        System.out.println("Salary: " +salary);
        
    }
}
public class Param {
    public static void main(String[] args){
        Employee emp1 = new Employee("Dhanya",1,"EEE", 2300000);
        Employee emp2 = new Employee("Sathya", 2, "CSE", 24000000);
        
        emp1.display();
        emp2.display();
    }
}
