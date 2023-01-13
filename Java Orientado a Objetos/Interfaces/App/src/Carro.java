public class Carro implements Veiculo{

    @Override
    public void primeiraMarcha() {
        System.out.println("Passando a primeira marcha");
        
    }

    @Override
    public void segundaMarcha() {
        System.out.println("Passando a segunda marcha");
        
    }

    @Override
    public void corDoVeiculo(String cor) {
        System.out.println(cor);
        
    }

}