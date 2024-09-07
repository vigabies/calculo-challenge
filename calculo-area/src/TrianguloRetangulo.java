public class TrianguloRetangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    // Construtor
    public TrianguloRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Sobrescrevendo o método calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
