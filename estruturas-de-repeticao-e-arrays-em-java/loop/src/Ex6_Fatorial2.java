import java.util.Scanner;

public class Ex6_Fatorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int num = sc.nextInt();
        int fatorial = 1;
        
        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(num + "! = " + fatorial);
    }
}