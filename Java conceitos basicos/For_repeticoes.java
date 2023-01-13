
public class For_repeticoes {

    public static void main(String[] args){

        String[] frutas = {"Banana", "Laranja", "Abacaxi", "Pera"};
        int indice = 0;

        // inicia indice com valor 0; verifica condição; incrementa indice
        for( indice = 0; indice < frutas.length; indice++ ){
            System.out.println(frutas[indice]);
        }

        // Imprime uma quebra de linha
        System.out.println("\n");

        indice = 0;
        // Ou também pode ser feito da seguinte forma
        // Para cada String dentro da lista de frutas imprimir ela
        for( String s : frutas){
            System.out.println(s);
        }
    
    }
}
