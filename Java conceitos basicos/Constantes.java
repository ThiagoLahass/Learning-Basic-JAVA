
public class Constantes {

    public static void main(String[] args){

        String nome = "Thiago Felippe Neitzke Lahass";

        // Declaracao de uma constante:
        // Recomendável declarar nome de constantes como tudo maiúsculo
        final String NOME = "Sicrano";
        final double PI = 3.14;

        System.out.println(nome);
        nome = "Fulano";
        // nome2 = "Marcos"; - Não é possível redefinir uma constante

        System.out.println(nome);
        System.out.println(NOME);
        System.out.println(PI);

    }
}
