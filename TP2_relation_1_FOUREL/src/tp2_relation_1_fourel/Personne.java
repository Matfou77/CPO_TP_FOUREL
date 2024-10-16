package tp2_relation_1_fourel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures = new Voiture[3] ;

    public Personne(String nomPersonne, String prenomPersonne) {
        nom = nomPersonne;
        prenom = nomPersonne; 
        
    }
    
        public boolean ajouter_voiture (Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) {
            return false;
        }
         if (nbVoitures >= 3) {
            return false;
        }
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.Proprietaire = this ;
        return true;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
   
}
