import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class MainPoo {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("TRINITY", "WITHE", 25);
        Gato gato1 = new Gato("MEDUSA", "BRANCO", 55);
        Passaro passaro1 = new Passaro("Picolino", "Red", 1);

       cachorro1.soar();
       gato1.soar();
       passaro1.soar();
    }
}