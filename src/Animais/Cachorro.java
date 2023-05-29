package Animais;

public class Cachorro extends Animal{
    //atributos

    static  int NumeroDeCachorros;
    private int TamanhDoRabo;

    public Cachorro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }


    // - ATÉ AQUI ESTÁ CORRETO
    public String pegar() {return "Bolinha";}
    public String interagir(String acao){
        switch (acao){
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "Bravo";break;
            case "pisar na patinha": this.estadoDeEspirito = "Triste";break;
            default: this.estadoDeEspirito = "Neutro";break;
        }
        return  estadoDeEspirito;
    }

    @Override
    public void soar() {
        System.out.println("au au");
    }
}