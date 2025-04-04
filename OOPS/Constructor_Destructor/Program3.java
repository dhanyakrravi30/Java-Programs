package Constructor_Destructor;

/*
 * 3. Constructor Overloading
Create a class Car with attributes brand, model, and price.
Implement constructor overloading by creating two constructors:
One with no parameters (default values).
Another with three parameters to initialize the attributes.
 */

 class Car{
    String brand;
    String model;
    float price;
    
    Car(){
        System.out.println("Default Constructor");
        brand="Honda";
        model="Civic";
        price=230000;
    }
    
    Car(String b, String m, float f){
        System.out.println("Parameterized Constructor");
        brand=b;
        model=m;
        price=f;
    }
    
    void display(){
        System.out.println("Brand:  " +brand);
        System.out.println("Model: " +model);
        System.out.println("Price: " +price);
      
    }
}
public class Program3 {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.display();
        
        Car c2 = new Car("BMW","Dragon",250000);
        c2.display();
    }
}


/*
 * OUTPUT
 * Default Constructor
Brand:  Honda
Model: Civic
Price: 230000.0
Parameterized Constructor
Brand:  BMW
Model: Dragon
Price: 250000.0
 */