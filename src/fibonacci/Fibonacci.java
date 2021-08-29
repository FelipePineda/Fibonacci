/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Felipe
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                int fibo = 10, num1 = 0, num2 = 1, suma = 1;

        System.out.println(num1);
         
        for (int i = 1; i < fibo; i++) {
         
            System.out.println(suma);
         
            suma = num1 + num2;
        
            num1 = num2;
          
            num2 = suma;
            
        }
        
    }
    
}
