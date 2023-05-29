import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        String nome = "Sandro Matias";
        System.out.println("Hello world! - " + nome);

        boolean fimDeSemana= false;
        boolean fazendoSol = false;
        boolean vamosAPraia= false;

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? " É fim de semana." : "Não é fim de semana";

        System.out.println(mensagem);

        int nota = 70;

        if ( nota >= 70){
            System.out.println("Aluno aprovado.");
        }else {
            System.out.println("Aluno reprovado.");
        }

        int novaNota = 50;
        String graduacao = null;

        if (novaNota >= 80){
            graduacao = "A";
        } else if (novaNota < 80 && novaNota >= 70) {
            graduacao = "B";
        } else if (novaNota < 70 && novaNota >= 60) {
            graduacao = "C";
        } else if (novaNota < 60 && novaNota >=50) {
            graduacao = "D";
        } else {
            graduacao: ;
        }
        switch (graduacao){
            case "A" :
            case "B" :
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado");
                break;
            default:
                System.out.println("Graduação Inválida");
        }
        String nomeNovo = "Sandro";
        System.out.println(nomeNovo.toUpperCase());
        System.out.println(nomeNovo.toUpperCase());
        System.out.println(nomeNovo.length());

        String nomeNovoOutro = "sandro";
        System.out.println(nomeNovo.equalsIgnoreCase(nomeNovoOutro));

        LocalDate hoje = LocalDate.now();
        Locale brasil =  new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime agora = LocalDateTime.now();
        String saudacao;
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá.";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nomeNovo, diaSemana, saudacao.toUpperCase() );

        for (int i = 1; i <=10;i++){
            for ( int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + "=" + j * i);
            }
        }
        int numero1 = 1;
        int numero2 = 1;
        int numero3 = 1;
        int numero4 = 1;
        int numero5 = 1;

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 1;
        numeros[3] = 1;
        numeros[4] = 1;
        for(int i=0; i <numeros.length; i++){
            System.out.println(numeros[i]);
        }
        String[] letras = { "A", "B", "C", "J", "X"};
        for (int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
       }
        System.out.println(Arrays.toString(letras));
        int[] numerosNovo = {9 , 10 ,12 ,25 , 2};
        int maior = numerosNovo [0];
        int menor = numerosNovo [0];
        int media = 0;
        for (int i=0; i < numeros.length; i++){
            if (numerosNovo[i] >maior ){
                maior = numerosNovo[i];
            }
            if (numeros[i] < menor ){
                menor = numeros[i];
            }
            media += numerosNovo[i];
        }
        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
        System.out.println("Media:" + media/numeros.length);

        String  nomeLindoAB = "Sandro";
        saudacao(nomeLindoAB);

        int resultado = soma(2, 3);
        System.out.println(resultado);


    }
    public static int soma(int a,int b){
        return a + b;
    }
    public static void saudacao(String nomeLindoAP) {
        System.out.println("Hello," + nomeLindoAP);
    }
}