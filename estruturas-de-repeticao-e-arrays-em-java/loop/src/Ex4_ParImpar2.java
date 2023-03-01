import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Versão incrementada do exercício 4
 * Ele não só mostra a quantidade de números pares e ímpares, 
 * como mostra quais são esses números.
 * Utilizei tanto a estrutura de repetição quanto o Array para armazenar os números digitados.
 */

public class Ex4_ParImpar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntdNumeros;
        int numero;
        int qntdPares = 0;
        int qntdImpares = 0;

        System.out.print("Quantidade de Números: ");
        qntdNumeros = sc.nextInt();

        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();

        int count = 0;
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            count++;

            if (numero % 2 == 0) {
                qntdPares++;
                pares.add(numero);
            } else {
                qntdImpares++;
                impares.add(numero);
            }
        } while (count < qntdNumeros);

        System.out.println("Quantidade de números pares: " + qntdPares);
        System.out.println("Números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + qntdImpares);
        System.out.println("Números ímpares: " + impares);
    }
}
