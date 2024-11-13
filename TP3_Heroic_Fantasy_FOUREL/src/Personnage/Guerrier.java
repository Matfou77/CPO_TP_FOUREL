package Personnage;

import Personnage.Personnage;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Guerrier extends Personnage{

    public static int nbr_Guerrier = 0;
    private boolean cheval;
    public boolean Personnage;
    public Guerrier(String nom, int NVvie, boolean cheval) {
        super(nom, NVvie);
        this.cheval = cheval;
        nbr_Guerrier++;
        nbr_Combattants++;
    }
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    @Override
    public String toString() {
        return super.toString() + "" + nom + "{" + "cheval=" + cheval + " ,NVvie=" + NVvie + '}';
    }

    public void close() {
        nbr_Combattants--;
        nbr_Guerrier--;
    }
    
}
