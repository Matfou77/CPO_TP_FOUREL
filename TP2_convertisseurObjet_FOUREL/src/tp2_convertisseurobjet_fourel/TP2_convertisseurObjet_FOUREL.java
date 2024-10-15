/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_fourel;

import java.util.Scanner;

/**
 *
 * @author foure
 */
public class TP2_convertisseurObjet_FOUREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conv = new Convertisseur();
        double nb ;
        int nb1 ;
        
        System.out.println("Bonjour, saisissez une valeur :");
        Scanner sc = new Scanner(System.in);
        nb = sc.nextDouble();
        
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        Scanner sc1 = new Scanner(System.in);
        nb1 = sc1.nextInt();        
        
    if (nb1 ==1) {
        System.out.println(conv.CelciusVersKelvin(nb));
    }
    if (nb1 ==2) {
        System.out.println(conv.KelvinVersCelcius(nb));
    }
    if (nb1 ==3) {
        System.out.println(conv.FarenheitVersCelcius(nb));
    }
    if (nb1 ==4) {
        System.out.println(conv.CelciusVersFarenheit(nb));
    }
    if (nb1 ==5) {
        System.out.println(conv.KelvinVersFarenheit(nb));
    }
    if (nb1 ==6) {
        System.out.println(conv.FarenheitVersKelvin(nb));
    }
     System.out.println("Nombre de conversions par le convertisseur 1 : " + conv.nbConversions);    
       
    }
}
        // TODO code application logic here
    
    

