import java.util.Scanner;
// Sous-Classe
public class Barbare extends Monstre {


    // Attributs du Barbare
    protected static ArmesMonstre arme;
    static String sTypeArmeEfficace ;


    // Constructeur
    Barbare() {
        super();
        s_iNbBarbareInstances++;

        arme = new Hache();
        sTypeArmeEfficace = "Epée";
    }

    // Attaque du Barbare Override celle des monstres
    public void attaque() {
        System.out.println("----- Le barbare lance une attaque contre vous");
        super.attaque();
    }

    // Pour retourner le nom du monstre
    @Override
    public String getMonsterName() {

        return "Barbare";
    }

    public void estVivant() {
        if (mPointsDeVieM > 0) {
            System.out.println("Il est vivant");
        } else {
            System.out.println("cfini");
        }

    }

    // Méthode pour vérifier que l'arme que le joueur utilise est la plus efficace

    public void getArmeEfficace() {

        verifArme =0;

        Scanner scannerArme = new Scanner(System.in);
        System.out.println("Tapez " + sTypeArmeEfficace + " pour attaquer");
        String armeJoueur = scannerArme.nextLine();
        if(armeJoueur.equals(sTypeArmeEfficace)){
            System.out.println("----- Vous avez choisi l'arme la plus efficace");
            verifArme = 1;

        }else{
            verifArme = 2;
            System.out.println("----- Arme non efficace");

        }

    }
}
