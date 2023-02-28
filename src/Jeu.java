import java.util.Random;
import java.util.Scanner;

public class Jeu {

    // Méthode pour commencer le Jeu
    void commencer() {
        System.out.println(" ******* DONJON playgames ********");
        // VOULEZ VOUS JOUER ? _ Récupère les inputs du joueur
        Scanner jeu = new Scanner(System.in);
        System.out.print("Voulez vous jouer ?  ");
        System.out.println(" ");
        System.out.println("Choix - 1 - oui ");
        System.out.println("Choix - 2 - non ");
        int lancementDuJeu = jeu.nextInt();
        if (lancementDuJeu == 1) {
            System.out.println("*********************************************************");
            System.out.println("******** LE JEU COMMENCE - FAITES PLACE AU HEROS ********");


            System.out.println("\\\\              //  ");
            System.out.println(" \\\\            _!_ ");
            System.out.println("  \\\\         //___\\ ");
            System.out.println("   \\\\        [[+++]} ");
            System.out.println("    \\\\    _ _\\\\^^^//_ _ ");
            System.out.println("     \\\\  ( )    '-'    ( )");
            System.out.println("        //\\\\/ | {&} | //\\ \\ ");
            System.out.println("         \\\\// \\     // // //");
            System.out.println("`            />:::; -''_ s'-'_'. ");
            System.out.println("             /::: //         \\\\");
            System.out.println("            /  / ||   {&}     || ");
            System.out.println("           /  /  \\           / ");
            System.out.println("          /  /    \\ '-.__.-'/ ");
            System.out.println("        _/  /      \\ \\   ");
            System.out.println("       /___|       /___| ");

            System.out.println("*********************************************************");
            System.out.println(" ");

        // Création du donjon et du héros
            creerDonjon();
            creerHeros();


        } else {

            finJeu();

        }


    }

    public static void finJeu(){
        System.out.println("********************************************");
        System.out.println("******** A LA PROCHAINE MAUVIETTE ********");
        System.out.println("********************************************");
    }

    public static void leJoueurAGagne(){

        System.out.println("                                                                     /$$ ");
        System.out.println("                                                                    |__/ ");
        System.out.println("                  /$$   /$$  /$$$$$$  /$$   /$$       /$$  /$$  /$$ /$$ /$$$$$$$ ");
        System.out.println("                 | $$  | $$ /$$__  $$| $$  | $$      | $$ | $$ | $$| $$| $$__  $$ ");
        System.out.println("                 | $$  | $$| $$ \\ $$| $$  | $$      | $$ | $$ | $$| $$| $$ \\ $$ ");
        System.out.println("                 | $$  | $$| $$  | $$| $$  | $$      | $$ | $$ | $$| $$| $$  | $$ ");
        System.out.println("                 |  $$$$$$$|  $$$$$$/|  $$$$$$/      |  $$$$$/$$$$/| $$| $$  | $$ ");
        System.out.println("                 \\____  $$\\______/ \\______/      \\_____/\\___/ |__/|__/  |__/ ");
        System.out.println("                  /$$  | $$ ");
        System.out.println("                 |  $$$$$$/ ");
        System.out.println("                 \\______/ ");


    }

    public static void continuerJeu (){
        Scanner jeu = new Scanner(System.in);
        System.out.print("Voulez vous continuer ?  ");
        System.out.println(" ");
        System.out.println("Choix - 1 - oui ");
        System.out.println("Choix - 2 - non ");
        int lancementDuJeu = jeu.nextInt();
        if (lancementDuJeu == 1) {
            System.out.println("*********************************************************");
            System.out.println("******** C'EST REPAAAAAAARTIIIII - IL EST VIVANT ********");
            System.out.println("*********************************************************");
            System.out.println(" ");

            creerDonjon();
        }else{
            finJeu();
        }

    }





    static void creerDonjon(){
        Random nb = new Random();
        int donj = nb.nextInt(10 - 5 +1)+5;

        Donjon codingDonjon = new Donjon(donj);
    }

    void creerHeros(){

        Hero hero = new Hero();



    }





}
