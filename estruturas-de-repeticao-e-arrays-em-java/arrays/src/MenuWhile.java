import java.util.Scanner;

public class MenuWhile {
    public static void main(String[] args) {
        String[] menu = {"Chá", "Café", "Capuccino", "Água", "Chocolate Quente"};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o pedido: ");
        int order = sc.nextInt();
        
        while(order < 0 || order > 4) {
            System.out.print("Pedido Inválido. Digite o pedido novamente: ");
            order = sc.nextInt();
        }
        
        System.out.println(menu[order]);
        System.out.println("Obrigado, volte sempre!");
    }
}