package Personnage;

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
    public static int nbr_Magicien = 0;
    public Magicien(String nom, int NVvie, boolean confirme) {
        super(nom, NVvie);
        this.confirme = confirme;
        nbr_Combattants++;
        nbr_Magicien++;

    }
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return super.toString() + "" + nom + "{" + "confirme=" + confirme + " ,Nvvie=" + NVvie + "}";
    }
    public void close() {
        nbr_Combattants--;
        nbr_Magicien--;
    }
}
