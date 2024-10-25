package tp3_heroic_fantasy_fourel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public abstract class Personnage {
    private String nom;
    private int NVvie;
    public Personnage(String nom , int NVvie) {
    this.nom = nom ;
    this.NVvie = NVvie;
    }

    public String getNom() {
        return nom;
    }

    public int getNVvie() {
        return NVvie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", NVvie=" + NVvie + '}';
    }
    

}
