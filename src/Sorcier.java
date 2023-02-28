import java.util.Scanner;

public class Sorcier extends Monstre{
    // Attributs
   static  String sTypeArmeEfficace = "Fiole_Eau";
   protected static ArmesMonstre arme;


    // Reprend les attributs de la classe mère + Défini l'arme du sorcier
    Sorcier(){

        super();
        s_iNbSorcierInstances++;
        this.arme = new Eclair();

    }


    // Reprend la méthode de la classe mère et indique l'attaque
    public  void attaque() {
        System.out.println("----- Le sorcier lance une attaque contre vous");
        super.attaque();
    }

// Méthode qui vérifie que l'arme entrée en input par le joueur est l'arme la plu efficace
    public void getArmeEfficace() {

        verifArme =0;

        Scanner scannerArme = new Scanner(System.in);
        System.out.println("Tapez " + sTypeArmeEfficace + " pour attaquer");
        String armeJoueur = scannerArme.nextLine();
        if(armeJoueur.equals(sTypeArmeEfficace)){
            System.out.println("----- Vous avez choisi l'arme la plus efficace");
            verifArme = 1;

        }else{
            System.out.println("----- Arme non efficace");
            verifArme = 2;
        }

    }




    boolean estArmeEfficace(String sTypeArmeEfficace){

            System.out.println("Eclair");

        return true;
    }

    // Méthode pour renvoyer le nom du monstre
    @Override
    public String getMonsterName(){
        return "Sorcier";
    }

   public void estVivant() {
        if (mPointsDeVieM > 0) {
            System.out.println("Il est vivant");
        } else {
            System.out.println("fin");
        }

    }
}

