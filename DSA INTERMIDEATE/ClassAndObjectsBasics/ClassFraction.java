/*Problem Description
Construct a class Fraction which stores a fraction. It should contain the

-Numerator
-Denominator

Assume denominator will never be 0.

The class should support the following functionalities

add(Fraction) -> Returns the sum of two fractions

subtract(Fraction) -> Returns the difference of two fractions

multiply(Fraction) -> Returns the product of two fractions

The fraction returned needs to be in the simplest form. If the fraction is p/q then p and q must be co-prime.

You may define any properties in the class as you see appropriate. */
package ClassAndObjectsBasics;

public class Fraction {
    int numerator, denominator;  
       
    // Define constructor here
    Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }      
       
    Fraction add(Fraction a){
        // Complete the function
        int num=numerator*a.denominator + denominator*a.numerator;
        int den=denominator*a.denominator;
        int temp= hcf(num,den);
       return new Fraction(num/temp,den/temp);    
                   
    }
       
    Fraction subtract(Fraction a){
        // Complete the function
        int num=numerator*a.denominator-denominator*a.numerator;
        int den=denominator*a.denominator;
        int temp=hcf(num,den);
       return new Fraction(num/temp,den/temp);
    }
       
    Fraction multiply(Fraction a){
        // Complete the function
        int num=numerator*a.numerator;
        int den=denominator*a.denominator;
        int temp=hcf(num,den);
        return new Fraction(num/temp,den/temp);        
    }
    int hcf(int a, int b){
            if(b==0)
            return a;
            if(a%b<0){
                int negTOposRem=a%b +b;
                return hcf(b,negTOposRem);
            }
            else
            return hcf(b,a%b);
    }    
       
}
