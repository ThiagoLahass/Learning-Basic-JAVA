
public class Switch {

    public static void main(String[] args){

        String[] frutas = {"Banana", "Laranja", "Abacaxi", "Pera"};

        int opcao = 1;

        switch (opcao) {
            case 1:
                System.out.println( frutas[0] );
                break;

            case 2:
                System.out.println( frutas[1] );
                break;

            case 3:
                System.out.println( frutas[2] );
                break;
                
            default:
                System.out.println( frutas[3] );
        }
    
    }
}
