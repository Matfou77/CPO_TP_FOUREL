package Personnage;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public abstract class Personnage {

    public static int nbr_Combattants = 0;
    String nom;
    int NVvie;
    int nbArme=0;
    Arme Arme_En_Main = null;
    ArrayList<Arme> Liste_Arme = new ArrayList<>();
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
    
    public Boolean AmrePref() {
        for (int i=0 ; i < Liste_Arme.size() ; i++ ) {
            if (this instanceof Guerrier  && Liste_Arme.get(i) instanceof Epee)return true;
            
            if (this instanceof Magicien && Liste_Arme.get(i) instanceof Baton)return true;
        }
        return false;
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

    @Override
    public String toString() {
        String Competences = "Personnage{" + "nom=" + nom + ", NVvie=" + NVvie + 
                ", nbArme=" + nbArme + ", Arme_En_Main=" + Arme_En_Main +  " ,Liste_Arme=" + Liste_Arme + 
                ", les armes prefere sont : ";
        for (int i=0 ; i < Liste_Arme.size() ; i++ ) {
            if (this instanceof Guerrier && Liste_Arme.get(i) instanceof Epee) return "Arme prefere";
            
            if (this instanceof Magicien && Liste_Arme.get(i) instanceof Baton) return "Arme prefere";
        }
        return Competences;
    }
}