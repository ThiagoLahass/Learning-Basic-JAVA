package veiculo;
public class Carro extends Veiculo{
    
    protected int num_rodas = 4;

    public Carro(String cor, double largura, double altura) {
        super(cor, largura, altura);
    }

    public int getNum_rodas() {
        return num_rodas;
    }

    

}
