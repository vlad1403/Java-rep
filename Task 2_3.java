/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3_factorial;

/**
 *
 * @author Влад
 */
import java.util.Scanner;

public class Task3_factorial {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите число для вычисления факториала");
        String number = in.nextLine();
        
        int n = Integer.parseInt (number);
        
        System.out.println (factorial (n));
    }
        public static int factorial (int n) {
        int result;
        if (n == 0) return 1;
        result =  n * factorial (n-1);
        return result;
    }
    
}
