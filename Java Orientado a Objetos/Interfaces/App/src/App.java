public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();

        carro.primeiraMarcha();
        carro.segundaMarcha();
        carro.corDoVeiculo("Preto");

        Caminhao caminhao = new Caminhao();

        caminhao.primeiraMarcha();
        caminhao.segundaMarcha();
        caminhao.corDoVeiculo("Branco");
    }
}
