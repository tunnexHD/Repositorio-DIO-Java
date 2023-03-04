import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length ;  i++){
            int num = random.nextInt(100); //100 é o limite (bound)
            numerosAleatorios[i] = num;

        }
        System.out.println("Números Aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print(num + " ");
        }
        System.out.println("\nSucessor dos Números Aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print(++num + " ");
        }
        System.out.println("\nAntecessor dos Números Aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print(--num + " ");
        }

    }
}
