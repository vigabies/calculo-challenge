
public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Sobrescrevendo o método calcularArea    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
