/*Problem Description

Construct a class Rectangle that represents a rectangle.
The class should support the following functionalities:-
perimeter() -> returns the perimeter of the rectangle
area() -> returns the area of the rectangle
You may define any properties in the class as you see appropriate. */
package ClassAndObjectsBasics;

public class Rectangle {
    // Define properties here
    int Length,Breadth;
   
    // Define constructor here
Rectangle(int Length, int Breadth){
 this. Length = Length;
this.Breadth= Breadth;
}
    int perimeter(){
        // Complete the function
        return  2*(this.Length+this.Breadth);  
    }
   
    int area(){
        // Complete the function
        return this.Length*this.Breadth;
    }
}

/*
    Rectangle a = new Rectangle(2, 3)  // Length = 2, Breadth = 3
    a.perimeter() // Should give 10
    a.area() // Should give 6
*/
    
