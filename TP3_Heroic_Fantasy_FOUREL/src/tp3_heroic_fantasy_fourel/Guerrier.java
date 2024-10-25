package tp3_heroic_fantasy_fourel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Guerrier extends Personnage{
    private boolean cheval;
    public Guerrier(String nom, int NVvie, boolean cheval) {
        super(nom, NVvie);
        this.cheval = cheval;
    }
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
}
