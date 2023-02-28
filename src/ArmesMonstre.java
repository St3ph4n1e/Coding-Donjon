public class ArmesMonstre extends Armes {

    // Classe mère des armes des monstres

    int m_compteAreboursCritique;

    // Constructeur
    ArmesMonstre(){
        super();
        pointsDattaque = 12;
    }


    // Méthode pour infliger des dégats au héros durant les attaques
  static void degatsInfliges() {


        Hero.mPointsDeVieH -= pointsDattaque;
        System.out.println(pointsDattaque+" points de dégats au Héros");

    }

    public String getNomArmeMonstreName(){

        return "Arme Monstre";
    }

}

