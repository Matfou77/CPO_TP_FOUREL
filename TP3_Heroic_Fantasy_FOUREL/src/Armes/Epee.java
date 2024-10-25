package Armes;

import Armes.Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Epee extends Arme {
    private int finesse ; 
    public Epee(String nom, int finesse, int NVattaque) {
        super(nom, NVattaque);
        if (finesse < 100) this.finesse = finesse ;
        else this.finesse = 0;
    }

    public int getFinesse() {
        return finesse;
    }
    
    
}
