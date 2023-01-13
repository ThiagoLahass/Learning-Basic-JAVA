public class Veiculo {
    private String cor;
    private double largura;
    private double altura;

    public Veiculo(String cor, double largura, double altura) {
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
    }

    public void primeiraMarcha(){
        System.out.println("Passando a primeira marcha");
    }

    public void segundaMarcha(){
        System.out.println("Passando a segunda marcha");
    }

    public void marchas(){
        this.primeiraMarcha();
        this.segundaMarcha();
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
