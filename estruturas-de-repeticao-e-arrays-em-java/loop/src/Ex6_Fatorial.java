import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número: ");
        int fatorial = sc.nextInt();
        int multiplicacao = 1;

        for(int i = fatorial ; i >= 1 ; i--){
            multiplicacao = multiplicacao * i;
       }
       System.out.println(fatorial + "! = " + multiplicacao);
       //System.out.println("Fatorial: " + multiplicacao);
    }
}
