
package myfirstproject;

import java.util.Scanner;

public class MyFirstProject {
   
 
    public static void main(String[] args) {
     
        char operator;  // reserve the position of the operator there will be gotten from a user
        
        double num1,num2; // declare the variable which a user put the numbers
        
        
        Scanner input= new Scanner(System.in);  
        
        System.out.println("Enter the operator (+, -, *, /)"); // print the operator to the user
        
        operator= input.next().charAt(0); // getting the operator from the user
        
        
        System.out.println("Enter the two number one by one"); // tell the user write the number
        
        // getting the number from the user
        num1= input.nextDouble();
        num2= input.nextDouble();
        
        
        // make the calculator excution by switch method
        
        switch ( operator )
        {
            
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
                break;
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2));
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2));
                break;
                
            case '/':
                if(num2 != 0) // Mathemical rule :) !
                {
                System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1/num2));
                } else {
                    System.out.println("Divied by zero situation");
                }
                break;
                
                default:
                    System.out.printf("%c is an invaild operator", operator); // if the user putting other dataTypes like a Question mark
                       
        }
    
        
    }
    
}
