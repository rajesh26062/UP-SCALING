/*Construct a class called Matrix which stores a 2D Array. It should store

The number of rows

The number of columns

The 2D Array itself

Implement the following functionalities inside this class :-

input() -> Reads the input from the user. This method should read the input from the user and populate the entire array. Each row will be in a new line and all the elements in a row will be space-separated.

add(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.

subtract(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.

transpose() -> Returns a new matrix containing the transpose of the given original matrix.

print() -> prints the entire matrix row by row. Each row will be in a new line and values in each row should be separated by a single space.

You may define any properties in the class as you see appropriate. */
package ClassAndObjectsBasics;

import java.util.Scanner;

public class Matrix {
    // Define properties here
    int r;
    int c;  
    int[][] arr;

    // Define constructor here
    Matrix(int r, int c){
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }
   
    void input(Scanner sc){
        // Use the Scanner object passed as argument for taking input and not a new Scanner object
        // Complete the function
        for(int i =0 ; i < this.r; i++){
            sc.nextLine();
            for(int j = 0; j < this.c; j++){
                int in = sc.nextInt();
                this.arr[i][j] = in;
            }
        }
    }
   
    Matrix add(Matrix x){
        Matrix addmatrix =  new Matrix(this.r, this.c);
        for(int i = 0; i < this.r; i++){
            for(int j = 0; j < this.c; j++){
                addmatrix.arr[i][j] = x.arr[i][j] + this.arr[i][j];
            }
        }
        return addmatrix;
    }
   
    Matrix subtract(Matrix x){
        // Complete the function
        Matrix submatrix =  new Matrix(this.r, this.c);
        for(int i = 0; i < this.r; i++){
            for(int j = 0; j < this.c; j++){
                submatrix.arr[i][j] = this.arr[i][j] - x.arr[i][j];
            }
        }
        return submatrix;
    }
       
    Matrix transpose(){
        Matrix transposematrix = new Matrix(this.c, this.r);
        for(int i = 0; i < this.r; i++){
            for(int j = 0; j < this.c; j++){
                transposematrix.arr[j][i] = this.arr[i][j];
            }
        }
        return transposematrix;
    }
   
    void print(){
        // Complete the function
        for(int i = 0; i < this.r; i++){
            for(int j = 0; j < this.c; j++){
               System.out.print(this.arr[i][j] +" ");
            }
            System.out.println();
           
        }
    }
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
    a.input()
    Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
    b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/
