/* Author: Jack
Date: 10/31/16
Description: making thing with loops
*/

import java.util.Scanner;
public class Comp{
    
    public static void main(String [] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please select one of four counting programs to run ");
    System.out.println("Type 1 for 1 to 1000000 by 1's, type 2 for 0 to 1000000 by 5's");
    System.out.println("Type 3 for 100 down to 1 by 1's, and type 4 for 1000 to 100000 by 10's");
    String number = scan.nextLine();
    
    // bobby
        if(number.equals ("1")){
         for (int i = 1; i <= 1000000; i ++) {
            System.out.print(i + " ");
        }
        
         System.out.println();
    
    } 
    // bobby
        else if(number.equals ("2")){
        for (int i = 0; i <= 1000000; i +=5) {
              System.out.print(i + " ");
         }
        
         System.out.println();
        
    }
    // jack
        else if(number.equals ("3") ){

    for(int i = 100; i >= 0; i--){
        System.out.print(i + " ");
    }
    }
   // jack
    else if(number.equals ("4")){
    for(int i = 1000; i <= 100000; i += 10) {
        System.out.print(i + " ");
    }   
    }
    System.out.print("Thank you for running my Super-Computer!!!");  
    }
}


