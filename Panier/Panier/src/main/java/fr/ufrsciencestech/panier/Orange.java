/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author profil
 */
public class Orange {
    private double prix;
    private String origine;
    
    public Orange(double p,String o){
        if(p>=0)
            prix=p;
        else
            prix=0;
        origine=o;
    }
    public double getPrix(){
        return prix;
    }
    public String getOrigine(){
        return origine;
    }
    @Override
    public String toString(){
        return "Origine : "+origine+" - Prix : "+prix+"€\n";
    }
    public boolean equals(Orange comp){
        return comp.getPrix()==prix && comp.getOrigine().equals(origine);
    }
}
