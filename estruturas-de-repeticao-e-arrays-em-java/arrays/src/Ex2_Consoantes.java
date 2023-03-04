import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntdConsoantes = 0;

        int count = 0;
        do {
            System.out.print("\nLetra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u") ) ) {
            consoantes[count] = letra;
            qntdConsoantes++;

            }
            count++;

        } while (count < consoantes.length);

        System.out.print("\nConsoantes: ");
        for (String string : consoantes) {            
            if(string != null)
                System.out.print(string + " ");
        }

        System.out.println("\nQuantidade de Consoantes: " + qntdConsoantes);
    }
}
