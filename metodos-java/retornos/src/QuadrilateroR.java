public class QuadrilateroR {

    public static double area1(double lado) {
        return lado * lado;
    }

    public static double area1(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area1(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static float area1(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2)/2;
    }

}