import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(true) {
        System.out.print ("Nome: ");
        String nome = scanner.next();
        if (nome.equals("0"))
        break;

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        }

    }
}
