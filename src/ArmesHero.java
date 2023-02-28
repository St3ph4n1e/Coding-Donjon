public class ArmesHero extends Armes{

    // Classe mère des armes du héro

    int iAttaqueBonus;



    // Constructeur pour les armes
    ArmesHero(){
        super();
        pointsDattaque = 12;
    }


    public int setAttaqueBonus(){

        return iAttaqueBonus;

    }

// Dégats infligés au monstre
   static void degatsInfligesM() {

        System.out.println("-Vous avez infligé " + (Hero.m_iForce + pointsDattaque)+" points de dégats ----- ");

    }
}
