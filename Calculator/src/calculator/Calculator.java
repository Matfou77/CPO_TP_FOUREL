/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author foure
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Please enter the operator :");
       System.out.println("1) add");
       System.out.println("2) substract");
       System.out.println("3) multiply");
       System.out.println("4) divide");
       System.out.println("5) modulo");
       
        int operateur;
        int operande1;
        int operande2;
       Scanner sc = new Scanner(System.in);
        operateur=sc.nextInt();
        while (operateur < 1 || operateur > 5)
            
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter the first number :");
        operande1=sc1.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the second number :");
        operande2=sc2.nextInt();
        if (operateur == 1)
            System.out.println(operande1 + operande2 );
        if (operateur == 2)
            System.out.println(operande1 - operande2 );
        if (operateur == 3)
            System.out.println(operande1 * operande2 );
        if (operateur == 4)
            System.out.println(operande1 / operande2);
        if (operateur == 5)
            System.out.println(operande1 % operande2);
        {
            
        }}
    
}
