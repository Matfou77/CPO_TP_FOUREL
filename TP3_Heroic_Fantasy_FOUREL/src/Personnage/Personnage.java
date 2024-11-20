package Personnage;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_fourel.etreVivant;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public abstract class Personnage  implements etreVivant {

    public static int nbr_Combattants = 0;
    String nom;
    int NVvie;
    int nbArme=0;
    Arme Arme_En_Main = null;
    ArrayList<Arme> Liste_Arme = new ArrayList<>();
    private int points;
    public Personnage(String nom , int NVvie) {
    this.nom = nom ;
    this.NVvie = NVvie;
    }
    
    public boolean ajouter_Arme(Arme Arme_a_ajouter) {
        Personnage perso = Arme_a_ajouter.getProprietaire();
        if (perso!=null) {
            return false;
        }
        if (nbArme>5) {
            return false;
        }
        Liste_Arme.add(Arme_a_ajouter);
        nbArme++;
        return true;   
    }

    public Arme Equiper_Arme(int x) {
        Arme_En_Main = Liste_Arme.get(x);
        System.out.println(nom + " equipe : [ " + Liste_Arme.get(x) + " ]");
        return Arme_En_Main;
    }
    
    public Arme getArme_En_Main() {
        return Arme_En_Main;
    }
        
    public String getNom() {
        return nom;
    }

    public int getNVvie() {
        return NVvie;
    }
    
    public void competences() {
        if (NVvie <= 0) {
            System.out.println(nom + "est Mort");
        }
        else {
        System.out.println( "Personnage{" + "nom=" + nom + ", NVvie=" + NVvie + "]");
        }
    }
    @Override
    public void seFatiguer() {
        NVvie=NVvie-10;
    }
    
    @Override
    public boolean estVivant() {
        return NVvie>0;
    }
    
    @Override
    public void estAttaque(int points) {
        points=this.points;
        NVvie=NVvie - points;
    }
    
    public void attaquer(Personnage autrePersonnage) {
        if (this instanceof Magicien) {
            int degats = 30; // Dégâts spécifiques pour le magicien
        System.out.println(autrePersonnage.nom + " (Guerrier) attaque " + nom + " et inflige " + degats + " points de degats.");
        this.estAttaque(degats);
        NVvie = NVvie - degats;
        } else if (this instanceof Guerrier) {
            int degats = 20; // Dégâts spécifiques pour le guerrier
        System.out.println(autrePersonnage.nom + " (Magicien) attaque " + nom + " et inflige " + degats + " points de degats.");
        this.estAttaque(degats);
        NVvie = NVvie - degats;
        }
    }
    @Override
    public String toString() {
        String Competences = "Personnage{" + "nom=" + nom + ", NVvie=" + NVvie + 
                ", nbArme=" + nbArme + ", Arme_En_Main=" + Arme_En_Main +  " ,Liste_Arme=" + Liste_Arme + 
                ", les armes prefere sont : ";
        for (int i=0 ; i < Liste_Arme.size() ; i++ ) {
            if (this instanceof Guerrier && Liste_Arme.get(i) instanceof Epee) return "Arme prefere de ";
            
            if (this instanceof Magicien && Liste_Arme.get(i) instanceof Baton) return "Arme prefere de ";
        }
        return Competences;
    }
}