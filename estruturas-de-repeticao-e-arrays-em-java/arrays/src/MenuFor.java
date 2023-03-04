import  java.util.Scanner;

public class MenuFor {
    public static void main(String[] args) {
        String[] menu = {"Chá", "Café", "Capuccino", "Água", "Chocolate Quente"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu pedido: ");
        int order = sc.nextInt();

        for (int i = 0; i < menu.length; i++) {
            if(i == order) {
            System.out.println(menu[order]);
            System.out.println("Obrigado, volte sempre!");
            return;
            }
        }
        System.out.println("Pedido Inválido!");
        
        
    }

}