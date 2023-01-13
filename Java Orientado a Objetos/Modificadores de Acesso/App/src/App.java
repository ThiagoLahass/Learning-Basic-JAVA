import veiculo.*;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * MODIFICADORES DE ACESSO
         * 
         * public   ->  Todas as classes tem acesso
         * private  ->  Só pode ser acessado dentro da própia classe
         * protected->  Somente as classes que estão no mesmo pacote(pasta) tem acesso
         * default  ->  Se não for definido nenhum modificador, o acesso será permitido apenas dentro do pacote
         */
        
        Carro carro = new Carro("Vermelho", 1.71, 1.25);

        System.out.println("Cor: " + carro.getCor());
        System.out.println("Largura: " + carro.getLargura());
        System.out.println("Altura: " + carro.getAltura() + "\n");
        System.out.println("Número de rodas: " + carro.getNum_rodas());

        carro.marchas();

        System.out.println("");

        Moto moto = new Moto("Amarelo", 0.75, 1.10);

        System.out.println("Cor: " + moto.getCor());
        System.out.println("Largura: " + moto.getLargura());
        System.out.println("Altura: " + moto.getAltura() + "\n");
        System.out.println("Número de rodas: " + moto.getNum_rodas());

        moto.marchas();
        
    }
}
