public class Caminhao implements Veiculo {

    @Override
    public void primeiraMarcha() {
        System.out.println("Passando a primeira marcha do caminhao");
        
    }

    @Override
    public void segundaMarcha() {
        System.out.println("Passando a segunda marcha do caminhao");
        
    }

    @Override
    public void corDoVeiculo(String cor) {
        System.out.println("Cor do caminhao: " + cor);
        
    }
    
}
