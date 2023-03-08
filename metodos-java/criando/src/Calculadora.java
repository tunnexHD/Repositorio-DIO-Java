public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println(numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println(numero1 + " x " + numero2 + " = " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println(numero1 + " / " + numero2 + " = " + resultado);
    }
public static void main(String[] args) {
    Calculadora.soma(2, 5);
}
}

