import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) throws Exception {
        /*Random random= new Random();

        int [][] matriz = new int [4][4];

        for(int l =0; l < matriz.length; l++){
            for(int c =0; c < matriz[l].length; c++){
                matriz[l][c] = random.nextInt(9);

            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
                
            }
            System.out.println(); // para pular linha a cada "l" da matriz
            
        }*/
    
    int count = 1;
    int num = 5;

    
    while(count<=3){
        ++count;
        num +=count;
    }
    System.out.println(num);
    


    
    
    }
}
