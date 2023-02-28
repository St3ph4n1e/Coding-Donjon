 abstract class Personnage {
    // Classe mère
   static int m_pointsDeVie;

   // Constructeur du Personnage
     Personnage(){

     }


   // abstract void attaque();




    public void getNbPointsVie(int m_pointsDeVie) {

    }

    public void DommageRecu(int iDegats) {

    }

     public void estVivant() {
         if (m_pointsDeVie > 0) {
             System.out.println("Il est vivant");
         } else {
             Jeu.finJeu();
         }

     }

 }
