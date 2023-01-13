public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro("Vermelho", 1.71, 1.25);

        System.out.println("Cor: " + carro.getCor());
        System.out.println("Largura: " + carro.getLargura());
        System.out.println("Altura: " + carro.getAltura() + "\n");

        carro.marchas();

        System.out.println("");

        Moto moto = new Moto("Amarelo", 0.75, 1.10);

        System.out.println("Cor: " + moto.getCor());
        System.out.println("Largura: " + moto.getLargura());
        System.out.println("Altura: " + moto.getAltura() + "\n");

        moto.marchas();
    }
}
