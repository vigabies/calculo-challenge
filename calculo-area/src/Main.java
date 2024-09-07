public class Main {
    public static void main(String[] args) {
        // Criando um Retângulo
        Retangulo retangulo = new Retangulo(5, 3);
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());

        // Criando um Triângulo Retângulo
        TrianguloRetangulo triangulo = new TrianguloRetangulo(4, 6);
        System.out.println("Área do Triângulo Retângulo: " + triangulo.calcularArea());
    }
}
