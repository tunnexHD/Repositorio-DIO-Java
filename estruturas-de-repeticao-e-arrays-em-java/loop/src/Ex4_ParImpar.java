import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntdNumeros;
        int numero;
        int qntdPares = 0;
        int qntdImpares = 0;

        System.out.print("Quantidade de Números: ");
        qntdNumeros = sc.nextInt();


        int count = 0;
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            count++;

            if (numero % 2 == 0)
            qntdPares++;
            else
            qntdImpares++;
        }
        while (count < qntdNumeros);

        System.out.println("Quantidade de números pares: " + qntdPares);
        System.out.print("Quantidade de números ímpares: " + qntdImpares);

        

    }
}
