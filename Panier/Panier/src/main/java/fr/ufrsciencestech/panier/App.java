package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Alors oui bonjour");
        Panier P=new Panier(5);
        /*P.addOrange(new Orange(0.80,"France"));
        P.addOrange(new Orange(0.80,"Espagne"));
        P.addOrange(new Orange(0.80,"Floride"));
        System.out.println(P.toString()+"\n\n");
        P.boycotteOrigine("France");
        System.out.println(P.toString()+"\n\n");*/
        Controller c=new Controller(P);
        VueGSwing vgs=new VueGSwing();
        vgs.setController(c);
        vgs.setPanier(P);
        vgs.setVisible(true);
        VueConsole vc=new VueConsole(P);
        P.addObserver(vgs);
        P.addObserver(vc);
    }
}
