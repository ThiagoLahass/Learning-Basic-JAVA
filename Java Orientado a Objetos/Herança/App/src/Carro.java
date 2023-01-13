public class Carro extends Veiculo{
    
    int num_rodas = 4;

    public Carro(String cor, double largura, double altura) {
        super(cor, largura, altura);
    }

    public int getNum_rodas() {
        return num_rodas;
    }

}
