import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String[] menu = {"Chá", "Café", "Capuccino", "Água", "Chocolate Quente"};
        Scanner sc = new Scanner(System.in);

        int order;

        for (;;) {
            System.out.println("Faça seu pedido:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + " - " + menu[i]);
            }
            System.out.print("Nº: ");
            order = sc.nextInt();
            if (order >= 0 && order <= 4) {
                break;
            } else {
                System.out.println("Pedido Inválido!");
                
            }
        }

        System.out.println("Você pediu: " + menu[order]);
        System.out.println("Obrigado, volte sempre!");
    }
}