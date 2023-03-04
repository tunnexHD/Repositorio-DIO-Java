import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        String[] menu = {"Chá", "Café", "Capuccino", "Água", "Chocolate Quente"};
        Scanner sc = new Scanner(System.in);

        int order;

        do {
            System.out.println("Faça seu pedido:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + " - " + menu[i]);
            }
            System.out.print("Nº: ");
            order = sc.nextInt();
        } while (order < 0 || order > 4);

        System.out.println("Você pediu: " + menu[order]);
        System.out.println("Obrigado, volte sempre!");
    }
}
