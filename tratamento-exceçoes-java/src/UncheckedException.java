import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
    
    boolean looping = true;
    do {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            looping = false;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada Inválida. Entre com um número inteiro: "
            /*  + e.getMessage() mensagem opcional associada ao objeto "e" */);
            //e.printStackTrace();
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Impossível dividir por 0. " + e.getMessage());
        
        } finally { //"finally" é opcional
            System.out.println("Chegou no finally!");
        }  
    } while(looping);

    System.out.println("O código continua...");
    }

public static int dividir(int a, int b) {
    return a / b;
}
}
