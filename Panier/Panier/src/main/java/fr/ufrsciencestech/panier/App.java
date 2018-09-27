package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Panier P=new Panier(5);
        P.addOrange(new Orange(0.80,"France"));
        P.addOrange(new Orange(0.80,"Espagne"));
        P.addOrange(new Orange(0.80,"Floride"));
        System.out.println(P.toString()+"\n\n");
        P.boycotteOrigine("France");
        System.out.println(P.toString()+"\n\n");
    }
}
