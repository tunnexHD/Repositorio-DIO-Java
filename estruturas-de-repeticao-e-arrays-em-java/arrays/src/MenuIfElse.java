import java.util.Scanner;

public class MenuIfElse {
      public static void main(String[] args) {
        String[] menu = {"Chá", "Café", "Capuccino", "Água", "Chocolate Quente"};
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu pedido: ");
        	int order = sc.nextInt();

        	if(order >= 0 && order <= 4){
        		System.out.println(menu[order]);
                System.out.println("Obrigado, volte sempre!");
        	}
        	else
                System.out.println("Pedido Inválido!");
        
    }

}