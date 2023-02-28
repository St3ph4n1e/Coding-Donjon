import java.util.Scanner;

 class Monstre extends Personnage{

    static int mPointsDeVieM = 40;

    public  String sTypeArmeEfficace;
    public static int s_iNbBarbareInstances;
    public static int s_iNbSorcierInstances;
     static int verifArme ;
    //private boolean m_bRechercheFaite = false;

    Monstre(){
        super();
        mPointsDeVieM = 40;

    }


    public void attaque(){


        System.out.print("----- Le "+getMonsterName()+" inflige " );
        ArmesMonstre.degatsInfliges();
        if(Hero.mPointsDeVieH >= 0){
            System.out.println("----- Il vous reste "+ Hero.mPointsDeVieH+" points de vie");
        }

    }



    public void getArmeEfficace(){

        Scanner scannerArme = new Scanner(System.in);
        System.out.println("Tapez " + sTypeArmeEfficace + " pour attaquer");
        String armeJoueur = scannerArme.nextLine();

        if(armeJoueur.equals(sTypeArmeEfficace)&& mPointsDeVieM>0){
            System.out.println("----- Vous avez choisi l'arme la plus efficace");
            verifArme = 1;

        }else{
            System.out.println("----- Arme non efficace");
            verifArme = 2;
        }


    }

    public boolean estArmeEfficace() {


        return true;

    }


    /*void attaque(Hero hero) {

        Hero.m_pointsDeVie -= 10;
    }*/

    public String getMonsterName(){

        return "Monstre";
    }

     public void estVivant() {
         if (mPointsDeVieM > 0) {
             System.out.println("Il est vivant");
         } else {
             System.out.println("fin");
         }

     }
}
