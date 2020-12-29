
package isthematrixsymmetricornot;
import java.util.Scanner;
public class IsTheMatrixSymmetricOrNot {

    /**
     Problem:
     Write a java program to check whether the given matrix is symmetric or not. Your program must 
     * take input matrix from the user,display it and check whether the matrix is symmetric or not.
     */
    public static void main(String[] args) {
        
    Scanner input =new Scanner(System.in);
     System.out.println("*Matrix must be sequer (Number of rows == Number of cols)");
     System.out.println("Enter number of rows: ");//enter the rows number
     int rows=input.nextInt();
     System.out.println("Enter number of col: ");//enter cols number
     int cols=input.nextInt();
     if(rows!=cols){//check matrix
    System.out.println("The matrix is not sequer ,try again");
     System.exit(0);}
     
    int matrix[][] = new int[rows][cols];
    
   for(int i=0;i<rows;i++){//enter the matrix elements
   for(int j=0;j<cols;j++){  
   System.out.println("enter the item in col "+j+" at row "+i);
    matrix[i][j]=input.nextInt();
   }
   }
  System.out.println("print the elements :");
   for(int i=0;i<rows;i++){//enter the matrix elements
   for(int j=0;j<cols;j++){  
   System.out.print(" "+matrix[i][j]+" ");

   }
   System.out.println();
   }
 
   for(int i=0;i<rows;i++){//the matrix is symmetric or not
   for(int j=0;j<cols;j++){  
  if(matrix[i][j]!=matrix[j][i]){System.out.println("The matrix is not symmetric"); System.exit(0);}
    
   }
    }
   System.out.println("The matrix is symmetric");
     
    
         
     
   
   }
    }

