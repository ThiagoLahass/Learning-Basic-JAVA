public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro("Vermelho", 1.71, 1.25);

        // carro.setCor("Vermelho");
        // carro.setLargura(1.71);
        // carro.setAltura(1.25);

        System.out.println("Cor: " + carro.getCor());
        System.out.println("Largura: " + carro.getLargura());
        System.out.println("Altura: " + carro.getAltura() + "\n");

        carro.marchas();
    }
}
