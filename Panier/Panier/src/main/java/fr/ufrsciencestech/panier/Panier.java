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
import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;

public class Panier extends Observable{
    private ArrayList<Orange> listeOrange;
    private int capacite;
    
    public Panier(int cap){
            capacite=cap;
            listeOrange=new ArrayList<Orange>();
    }
    public void addOrange(Orange o){
        if(!estPlein()){
            listeOrange.add(o);
            setChanged();
            notifyObservers();
        }
    }
    public void removeLastOrange(){
        if(!estVide()){
            listeOrange.remove(listeOrange.size()-1);
            setChanged();
            notifyObservers();
        }
    }
    public boolean contains(Orange comp){
        for(Orange o : listeOrange){
            if(comp.equals(o))
                return true;
        }
        return false;
    }
    public boolean estPlein(){
        return listeOrange.size()==capacite;
    }
    public boolean estVide(){
        return listeOrange.isEmpty();
    }
    public int getSize(){
        return listeOrange.size();
    }
    public double getPrix(){
        double ret=0;
        for(Orange o : listeOrange)
            ret+=o.getPrix();
        return ret;
    }
    public void boycotteOrigine(String boy){
        ArrayList<Orange> Corbeille=new ArrayList<Orange>();
        for(Orange o : listeOrange){
            if(o.getOrigine().equals(boy))
                Corbeille.add(o);
        }
        for(Orange o : Corbeille){
            listeOrange.remove(o);
        }
    }
    @Override
    public String  toString(){
        String ret="";
        for(Orange o : listeOrange)
            ret+=o.toString();
        return ret;
    }
    public boolean equals(Panier comp){
        for(Orange o : listeOrange){
            if(!comp.contains(o))
                return false;
        }
        return true;
    }
}
