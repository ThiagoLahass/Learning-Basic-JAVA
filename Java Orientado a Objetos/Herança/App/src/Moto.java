public class Moto extends Veiculo{
    int num_rodas = 2;

    public Moto(String cor, double largura, double altura) {
        super(cor, largura, altura);
    }

    public int getNum_rodas() {
        return num_rodas;
    }
}
