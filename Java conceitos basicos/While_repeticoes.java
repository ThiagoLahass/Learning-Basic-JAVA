
public class While_repeticoes {

    public static void main(String[] args){

        String[] frutas = {"Banana", "Laranja", "Abacaxi", "Pera"};
        int indice = 0;

        // Enquanto indice for menor que 4 o codigo englobado pelo while será executado
        while( indice < 4 ){
            System.out.println(frutas[indice]);
            indice++;
        }

        // Imprime uma quebra de linha
        System.out.println("\n");

        indice = 0;
        // Ou também pode ser feito da seguinte forma
        while( indice < frutas.length ){
            System.out.println(frutas[indice]);
            indice++;
        }
    
    }
}
