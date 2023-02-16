public class Relacionais {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        boolean simNao = true;

        if (simNao = num1==num2){
            System.out.println("Números iguais: " + simNao);}
        if (simNao = num1>num2){
            System.out.println("Número 1 é maior: " + simNao);}
        if (simNao = num1<num2){
            System.out.println("Número 2 é maior: " + simNao);}
        if (simNao = num1!=num2){
            System.out.println("Números diferentes: " + simNao);}

        
        if (num1==num2)
            System.out.println(simNao);
        else if (num1>num2)
            System.out.println("Número 1 maior");
        else
            System.out.println("Número 2 maior");
        
        
        
    }
}
