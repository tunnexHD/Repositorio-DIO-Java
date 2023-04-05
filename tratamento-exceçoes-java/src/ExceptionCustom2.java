import javax.swing.*;

public class ExceptionCustom2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)                
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                
                int resultado = numerador [i] / denominador [i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {  
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } /*catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0. " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Acessando index que não consta na lista. " + e.getCause());
            }*/

            
        }
        System.out.println("Chegou ao final...");

    }
}

class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}