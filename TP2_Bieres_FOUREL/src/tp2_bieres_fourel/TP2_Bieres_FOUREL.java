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
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson") ;
    uneBiere.lireEtiquette();
    BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe") ;
    uneSecondeBiere.lireEtiquette();
    BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Despe",10.0,"Carrefour") ;
    uneTroisiemeBiere.lireEtiquette();
    BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("86",8.0,"Louvre") ;
    uneQuatriemeBiere.lireEtiquette();
    BouteilleBiere uneCinquiemeBiere = new BouteilleBiere("Corona",15.0,"MaisonBlanche") ;
    uneCinquiemeBiere.lireEtiquette();
    
    System.out.println(uneBiere);
    uneBiere.decapsuler();
    System.out.println(uneBiere);
    System.out.println(uneSecondeBiere);
    System.out.println(uneTroisiemeBiere);
    System.out.println(uneQuatriemeBiere);
    System.out.println(uneCinquiemeBiere);

    }
    
}
