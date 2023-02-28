public class Hero extends Personnage{

    // Attributs du Héro en pls de ceux de la classe mère
    static int m_iForce = 10;
    static int mPointsDeVieH = 200;
    static ArmesHero arme;
    String armeChoix;

    int potionForce;
    int potionVie;

// Constructeur +  définition des attributs propre au Héro
    Hero(){
        super();
        mPointsDeVieH = 200;
        arme = selectionnerArme();

    }

    public void estVivant() {
        if (mPointsDeVieH > 0) {
            System.out.println("Il est vivant");
        } else {
            Jeu.finJeu();
        }

    }

    // Méthode d'attaque du Héro
    public static void attaque(){

       // System.out.println("Il vous reste "+ mPointsDeVieH + " points de vie");

      if(mPointsDeVieH>0){
          if (((Monstre.verifArme == 1)|| (Monstre.verifArme == 0)) && (Monstre.mPointsDeVieM >0) ){

              Monstre.mPointsDeVieM  -= m_iForce+ arme.pointsDattaque;
              arme.degatsInfligesM();
              System.out.println("Vous avez répliqué et infligé des dégats ----- ");
              if(Monstre.mPointsDeVieM >=0){
                  System.out.println("Il lui reste " + Monstre.mPointsDeVieM +" points de vie ----- ");
              }

          } else if ((Monstre.verifArme == 2)&& (Monstre.mPointsDeVieM >0)){

              System.out.println("Vous sautez votre tour");

          } else if (((Monstre.verifArme == 1)||(Monstre.verifArme == 0))&&Monstre.mPointsDeVieM <=0) {

              System.out.println("Le monstre est mort");


              //Fonction reboot do while jeu dans donjon

          }

      }else{
         Donjon.gameOver();
      }


    }

    // Méthode pour sélectionner son arme selon l'ennemi en face
    public ArmesHero selectionnerArme() {

        if (null == Donjon.m_roomMonster){
            System.out.println("Il n'y a pas de pièces disponibles");
        }else  {

            for (int i = 0; i < Donjon.m_roomMonster.size(); i++) {

                if(Donjon.m_roomMonster.get(i).m_idPiece % 2 == 0) {

                    ArmesHero epee = new Epee();

                    arme = epee;
                    this.armeChoix = "épee";

                } else{

                    ArmesHero fioleEau =new FioleEau();

                    arme = fioleEau;
                    this.armeChoix = "Fiole_Eau";
                }
            }

        }

        return arme;

    }
    public void ameliorerForce(){

        if(potionForce >0 ) {
            Potion.appliquerEffets();
        }

    }

    public void ameliorerVie(){

        if(potionVie >0 && m_pointsDeVie < 200) {
            Potion.appliquerEffets();
        }

    }

    public void decouvrirEnnemi(){





    }


    public void setForce(int nb){

    m_iForce = nb;

    }
    public void chercherPotion(){

    }


}
