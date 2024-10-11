/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_fourel;

/**
 *
 * @author foure
 */
public class TP2_Bieres_FOUREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere() ;
    uneBiere.nom = "Cuvee des trolls";
    uneBiere.degreAlcool = (float) 7.0 ;
    uneBiere.brasserie="Dubuisson";
    uneBiere.ouverte=false;
    uneBiere.lireEtiquette();
    BouteilleBiere uneSecondeBiere = new BouteilleBiere() ;
    uneSecondeBiere.nom = "Leffe";
    uneSecondeBiere.degreAlcool = (float) 6.6 ;
    uneSecondeBiere.brasserie="Abbaye de Leffe";
    uneSecondeBiere.ouverte=false;
    uneSecondeBiere.lireEtiquette();
    

    }
    
}
