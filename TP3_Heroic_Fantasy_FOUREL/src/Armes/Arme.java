package Armes;

import Personnage.Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public abstract class Arme {
    String nom;
    int NVattaque;
    Personnage Proprietaire = null;
    public Arme(String nom , int NVattaque) {
    this.nom = nom ;
    if (NVattaque < 0) this.NVattaque = 0;
    else this.NVattaque = NVattaque;
    }

    public Personnage getProprietaire() {
        return Proprietaire;
    }

    public String getNom() {
        return nom;
    }

    public int getNVattaque() {
        return NVattaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", NVattaque=" + NVattaque + '}';
    }
    
    
}
