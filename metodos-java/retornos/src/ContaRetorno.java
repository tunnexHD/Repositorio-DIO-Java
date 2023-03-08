public class ContaRetorno {

    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício retornos");

        double quadrado = QuadrilateroR.area1(3);
        System.out.println("Área do quadrado: " + quadrado);
    
        double retangulo = QuadrilateroR.area1(5, 3.0);
        System.out.println("Área do retângulo: " + retangulo);

        float losango = QuadrilateroR.area1(4, 5);
        System.out.println("Área do losango: " + losango);
    
        double trapezio = QuadrilateroR.area1(4, 3, 5);
        System.out.println("Área do trapézio: " + trapezio);

        }
}