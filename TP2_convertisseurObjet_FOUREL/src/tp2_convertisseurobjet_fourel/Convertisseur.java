package tp2_convertisseurobjet_fourel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Convertisseur {
     int nbConversions ;
    
    public Convertisseur () {
nbConversions = 0 ;
}

     public double CelciusVersKelvin (double nb) {
            System.out.println(+nb +" degre Celcius est egal a " +(nb+273) +" degres Kelvin");
             nbConversions += 1;
    return (nb+273);
    }
    public double KelvinVersCelcius (double nb) {
                System.out.println(+nb +" degre Kelvin est egal a " +(nb-273) +" degres Celcius");
                 nbConversions += 1;
        return (nb-273);
    }
    public double FarenheitVersCelcius (double nb) {
        System.out.println(+nb +" degre Farenheit est egal a " +(nb-32)/9*5 +" degres Celcius");
         nbConversions += 1;
        return (nb-32)/9*5 ;
    }
    public double CelciusVersFarenheit (double nb) {
        System.out.println(+nb +" degres Celcius est egal a " +(nb*1.8+32) +" degres Farenheit");
         nbConversions += 1;
        return (nb*1.8+32) ;
    }
    public double KelvinVersFarenheit (double nb) {  
        double nb2;
        nb2 = CelciusVersFarenheit(KelvinVersCelcius(nb)) ;
         nbConversions += 1;
         
        System.out.println(+nb +" degre Kelvin est egal a " +nb2 +" degres Farenheit");
        return nb2;
    }
    public double FarenheitVersKelvin (double nb) {
        double nb2;
        nb2 = CelciusVersKelvin(FarenheitVersCelcius(nb));
         nbConversions += 1;
        
        System.out.println(+nb +" degre Farenheit est egal a " +nb2 +" degres Kelvin");
        return nb2;
    }
    @Override
public String toString () {
 return "nb de conversions"+ nbConversions;
    }
}
