
public class Operadores_logicos {

    public static void main(String[] args){

        /*
         * && Operador E
         * || Operador OU
         */

        int a = 20;
        int b = 10;
        int c = 10;

        // Se 'a' for maior que 'b' E 'b' igual a 'c'
        if( a > b && b == c ){
            System.out.println("A variável 'a' é maior que a variável 'b', E a variável 'b' é igual a variável 'c'");
        }
        // Senão
        else{
            System.out.println("Teste");
        }

        // Se 'a' for igual a 'b' OU 'b' igual a 'c'
        if( a == b || b != c ){
            System.out.println("A variável 'a' é igual a variável 'b', OU a variável 'b' é igual a variável 'c'");
        }
        // Se não, 'a' for maior ou igual a 'c'
        else if( a >= c ){
            System.out.println("A variável 'a' é maior que a variável 'c'");
        }
        else{
            System.out.println("Teste");
        }

    }
}
