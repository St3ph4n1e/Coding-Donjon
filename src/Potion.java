 class Potion {
    // Classe mère
   protected static int m_iEffectValue;

    // Constructeur
   Potion()
   {
       m_iEffectValue = 20;
   }

   // Méthode pour appliquer les effets de la potion lorsqu'on l'utilise
     static void appliquerEffets(){

         Hero.m_iForce += m_iEffectValue;
     }

    public void setValue(int nb){

        this.m_iEffectValue = nb;

    }
}
