/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2_arif_operation;

/**
 *
 * @author Влад
 */
import java.util.Scanner;
public class Task2_arif_operation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result;
        String pusto;
        Scanner in1 = new Scanner (System.in);
        System.out.println ("Введите первое число");
        String number1= in1.nextLine();
       /* if (number1.equals(pusto)) {
            System.out.println ("Вы не ввели число. Повторите попытку");
            Scanner in1a = new Scanner (System.in);
            System.out.println ("Введите первое число");
            String number1a= in1a.nextLine();
        }*/
        int n1 = Integer.parseInt (number1);
        
        
        Scanner in2 = new Scanner (System.in);
        System.out.println ("Введите второе число");
        String number2= in2.nextLine();
        int n2 = Integer.parseInt (number2);
        
        Scanner op = new Scanner (System.in);
        System.out.println ("Введите номер орперации: 1 - сложение, 2- вычитание, 3- умножение, 4- деление");
        String operation = op.nextLine();
        
        String addition = "1";
        String computation = "2";
        String multiplacation = "3";
        String division = "4";
        
        if (operation.equals(addition)) {
            result = n1 + n2;
            System.out.println (result);
        } else { 
            if (operation.equals(computation)) {
            result = n1 - n2;
            System.out.println (result);   
            } else {
                if (operation.equals(multiplacation)) {
                result = n1 * n2;
                System.out.println (result);     
                } else {
                    if (operation.equals(division)) {
                     result = n1 / n2;
                     System.out.println (result); 
                    }
                }
            } 
                
        }
        
    }
    
}
