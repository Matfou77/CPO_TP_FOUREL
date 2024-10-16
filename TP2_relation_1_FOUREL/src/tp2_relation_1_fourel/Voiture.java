package tp2_relation_1_fourel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire = null;

    public Voiture(String nomModele, String nomMarque, int nbPuissanceCV) {
        Modele = nomModele;
        Marque = nomMarque;
        PuissanceCV = nbPuissanceCV;
        
    }
    
    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
 
}