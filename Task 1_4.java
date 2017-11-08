/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4_invert_line;

/**
 *
 * @author Влад
 */
import java.util.Scanner;

public class Task4_invert_line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please, enter the line");
        String line = scanner.nextLine();
        String string2 = new StringBuffer(line).reverse().toString();
        System.out.println(string2);
        
    }
    
}
