package tp3_heroic_fantasy_fourel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Magicien extends Personnage{
    private boolean confirme; 
    public Magicien(String nom, int NVvie, boolean confirme) {
        super(nom, NVvie);
        this.confirme = confirme;
    }
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

}
