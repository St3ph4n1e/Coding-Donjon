public class Piece {
    // Attributs
      int m_idPiece ;
     Monstre monstre;
     String nomMonstre;

     // Constructeur Pièce
    public Piece(int i){

        this.m_idPiece = i;
        setMonstre();



    }

    // Définir le monstre présent dans chaque pièce
    public void setMonstre(){

        // S'il s'agit dun chiffre pair ce sera un Barbare sinon un sorcier

        if (m_idPiece % 2 == 0){
            this.monstre= new Barbare();
            this.nomMonstre ="Barbare";

        } else{

            this.monstre = new Sorcier();
            this.nomMonstre ="Sorcier";

        }



    }

    // Méthode pour savoir quel monstre se trouve dans la pièce
    public String getMonstre(){
        System.out.println("********************************************");
        System.out.println("Dans cette pièce se trouve un " + nomMonstre);
        System.out.println("********************************************");
        return nomMonstre;


    }

    void entrerPiece(Hero hero){

    }



}
