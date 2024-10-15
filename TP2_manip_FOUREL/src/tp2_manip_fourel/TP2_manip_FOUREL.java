/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_fourel;

/**
 *
 * @author foure
 */
public class TP2_manip_FOUREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;
    
    Tartiflette assiette3 = assiette2 ;
    
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;

    Tartiflette temp = assiette1;  
        assiette1 = assiette2;         
        assiette2 = temp;              

        System.out.println("nb de Calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de Calories de Assiette 2 : " + assiette2.nbCalories);
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ; les 2 ne sont pas bonnes.
        
         Moussaka[] moussakaTab = new Moussaka[10];
           for (int i = 0; i < moussakaTab.length; i++) {
            moussakaTab[i] = new Moussaka(100 + i * 10);  // Instanciation de chaque Moussaka avec un nombre de calories différent
        }

        // Affichage du nombre de calories pour chaque objet Moussaka dans le tableau
        for (int i = 0; i < moussakaTab.length; i++) {
            System.out.println("Moussaka " + i + " contient " + moussakaTab[i].nbCalories + " calories.");
    }
    }
}
