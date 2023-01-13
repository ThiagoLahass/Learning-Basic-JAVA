
public class Tipos_variaveis {

    public static void main(String[] args){

        /*
        String  - Textos
        byte    - Números inteiros (-128 a 127)
        int     - Números inteiros (-2147483648 a 2147483647)
        long    - Números inteiros (-9223372036854875808 a 9223372036854875807)
        float   - Números decimais (1.1234567 até 7 casas decimais)
        double  - Números decimais (1.1234567890123456 até 15 casas decimais)
        boolean - Valores Booleanos (Estados) - 'true' ou 'false'
         */

        String nome = "Thiago Felippe Neitzke Lahass";
        byte bt = 20;
        int num = 1000000;
        long lg = 1000000000000000000L;
        float ft = 1.1234567f;
        double db = 1.123456789;
        boolean verdadeiro = true;


        System.out.println(nome);
        System.out.println(bt);
        System.out.println(num);
        System.out.println(lg);
        System.out.println(ft);
        System.out.println(db);
        System.out.println(verdadeiro);
    }
}
