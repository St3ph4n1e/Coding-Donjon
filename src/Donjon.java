import java.util.ArrayList;
import java.util.Scanner;

public class Donjon {

    // Array Liste pour contenir les pièces créés dans le donjon

    static ArrayList<Piece> m_roomMonster;

    // Création des pièces et lancement des combats
    Donjon(int nb) {

        saluerHero();
        // Création des pièces
        System.out.println("Vous allez devoir sortir vivant des " + nb + " pièces de ce donjon");
        m_roomMonster = new ArrayList<Piece>();
        for (int i = 0; i <= nb; i++) {
            m_roomMonster.add(new Piece(i));

        }

        lancerCombat();


    }


// Méthode pour lancer les combats
void lancerCombat(){

        /** Permet d'initier le choix de salle et le début des affrontements dans celles-ci */

    System.out.println("Quelle salle voulez-vous visiter à présent ");
    Scanner cont = new Scanner(System.in);
    int nb1 = cont.nextInt();

    getPiece(nb1);
    m_roomMonster.get(nb1).monstre.getMonsterName();
    m_roomMonster.get(nb1).getMonstre();
    m_roomMonster.get(nb1).monstre.mPointsDeVieM = 40;


    affrontement(nb1);


    do {

        affrontement(nb1);
        Hero.attaque();
        if ((m_roomMonster.get(nb1).monstre.verifArme == 2)&&(m_roomMonster.get(nb1).monstre.mPointsDeVieM > 0)) {

            System.out.println("");

            affrontement(nb1);
        }else{
            affrontement(nb1);
            Hero.attaque();

        }



    }while (((m_roomMonster.get(nb1).monstre.verifArme ==0)||(m_roomMonster.get(nb1).monstre.verifArme ==1))&&(m_roomMonster.get(nb1).monstre.mPointsDeVieM > 0));

    if ((m_roomMonster.get(nb1).monstre.mPointsDeVieM <= 0)&&(Hero.mPointsDeVieH >= 0)) {

        System.out.println("Vous avez vaincu le " + m_roomMonster.get(nb1).monstre.getMonsterName() + " de cette salle");
        System.out.println("*********************************************************");
        System.out.println("******** VOUS AVEZ VAINCU LE " + m_roomMonster.get(nb1).monstre.getMonsterName() + "  - AAAAAAH  ********");
        System.out.println("*********************************************************");
        lancerCombat();
    }else if (Hero.mPointsDeVieH <= 0) {

       gameOver();
        Jeu.continuerJeu();

    }

}


// Méthode pour avoir le numéro de la pièce
        void getPiece ( int iPiece){

            if (null == m_roomMonster) {
                System.out.println("Il n'y a pas de pièces disponibles");
            } else {

                System.out.println("Vous êtes dans la pièce n° : " + m_roomMonster.get(iPiece).m_idPiece);


            }
        }

        // Méthode des affrontements
        void affrontement ( int nb){

            if(Hero.mPointsDeVieH >=0){
                m_roomMonster.get(nb).monstre.attaque();
                m_roomMonster.get(nb).monstre.getArmeEfficace();

            }else{
                gameOver();
            }

        }


        void saluerHero () {
            System.out.println("Bienvenue dans Coding Donjon");

        }


        public static void gameOver () {
            if (Hero.m_pointsDeVie <= 0) {
                System.out.println("*********************************************************");
                System.out.println("******** VOUS AVEZ PERDU - - - - - - - GAME OVER ********");
                System.out.println("*********************************************************");
            }
        }
    }

