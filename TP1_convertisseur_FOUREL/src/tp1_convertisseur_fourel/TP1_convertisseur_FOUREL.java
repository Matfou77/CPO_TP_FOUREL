/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_fourel;

import java.util.Scanner;

/**
 *
 * @author foure
 */
public class TP1_convertisseur_FOUREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nb ;
        int nb1 ;
        double far;
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
    CelciusVersKelvin(nb);
}
    if (nb1 ==2) {
        KelvinVersCelcius(nb);
    }
    if (nb1 ==3) {
        FarenheitVersCelcius(nb);
    }
    if (nb1 ==4) {
        CelciusVersFarenheit(nb);
    }
    if (nb1 ==5) {
        KelvinVersFarenheit(nb);
    }
    if (nb1 ==6) {
        FarenheitVersKelvin(nb);
    }
    }
    public static double CelciusVersKelvin (double nb) {
            System.out.println(+nb +" degre Celcius est egal a " +(nb+273) +" degres Kelvin");
    return (nb+273);
    }
    public static double KelvinVersCelcius (double nb) {
                System.out.println(+nb +" degre Kelvin est egal a " +(nb-273) +" degres Celcius");
        return (nb-273);
    }
    public static double FarenheitVersCelcius (double nb) {
        System.out.println(+nb +" degre Farenheit est egal a " +(nb-32)/9*5 +" degres Celcius");
        return (nb-32)/9*5 ;
    }
    public static double CelciusVersFarenheit (double nb) {
        System.out.println(+nb +" degres Celcius est egal a " +(nb*1.8+32) +" degres Farenheit");
        return (nb*1.8+32) ;
    }
    public static double KelvinVersFarenheit (double nb) {  
        double nb2;
        nb2 = CelciusVersFarenheit(KelvinVersCelcius(nb)) ;
        System.out.println(+nb +" degre Kelvin est egal a " +nb2 +" degres Farenheit");
        return nb2;
    }
    public static double FarenheitVersKelvin (double nb) {
        double nb2;
        nb2 = CelciusVersKelvin(FarenheitVersCelcius(nb));
        
        System.out.println(+nb +" degre Farenheit est egal a " +nb2 +" degres Kelvin");
        return nb2;
    }
    
}
