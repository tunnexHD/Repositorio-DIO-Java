/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Matheus Drumond
 * @version 2.0
 * @since 22/02/2023
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        int resultado = numeroUm + numeroDois;
        System.out.println("Resultado da soma: " + resultado);
        return resultado;
    }

    /**
     * Este método é utilizado para subtrair dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a subtração dos dois números.
     */
    public int subtrair(int numeroUm, int numeroDois) {
        int resultado = numeroUm - numeroDois;
        System.out.println("Resultado da subtração: " + resultado);
        return resultado;
    }

    /**
     * Este método é utilizado para multiplicar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a multiplicação dos dois números.
     */
    public int multiplicar(int numeroUm, int numeroDois) {
        int resultado = numeroUm * numeroDois;
        System.out.println("Resultado da multiplicação: " + resultado);
        return resultado;
    }

    /**
     * Este método é utilizado para dividir dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a divisão dos dois números.
     */
    public double dividir(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        double resultado = numeroUm / numeroDois;
        System.out.println("Resultado da divisão: " + resultado);
        return resultado;
    }
}

