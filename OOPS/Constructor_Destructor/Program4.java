package OOPS.Constructor_Destructor;

/*
 * 4. Copy Constructor
Implement a class Book with attributes title and author.
Create a copy constructor that initializes a new object using an existing object.

 */
class Books{
    String title;
    String author;
    
    Books(String a, String b){
        title = a;
        author = b;
    }
    
    Books(Books c){
        title = c.title;
        author = c.author;
    }
    
    void display(){
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
    }
}
public class Program4 {
    public static void main(String[] args){
        Books b1= new Books("APJ","WOF");
        b1.display();
        
        Books b2 = new Books(b1);
        b2.display();
    }
}



/*
 * Title: APJ
Author: WOF
Title: APJ
Author: WOF
 */