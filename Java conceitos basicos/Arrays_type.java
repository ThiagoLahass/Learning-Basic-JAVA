import java.util.Arrays;

public class Arrays_type {

    public static void main(String[] args){

        // São basicamente listas
        // Exemplo Array de Strings:

        // Indices começam em 0
        //                  0      ,  1       ,  2       ,  3
        String[] frutas = {"Banana", "Laranja", "Abacaxi", "Pera"};

        
        System.out.println( "Minhas Frutas: " + frutas[0] + ", " + frutas[1] + ", " + frutas[2] + ", " + frutas[3] + "!!!" );

        System.out.println( Arrays.toString(frutas));

        System.out.println("A quantidade de frutas na linha lista é: " + frutas.length);
    }
}
