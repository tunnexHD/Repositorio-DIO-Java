public class Unario {
    
    public static void main(String[] args) {
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);
        
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        
        System.out.println(numero ++);
        // programa entende que você quer primeiro imprimir o valor do número e depois incrementá-lo
        
        System.out.println(numero);// imprime 7 por causa do incremento anterior
        
        System.out.println(++ numero);//imprime 8 já que a ordem de precedencia conta aqui
        
        boolean verdadeiro = true;

        // duas formas de inverter a variável booleana
        verdadeiro = !verdadeiro;
        System.out.println("Inverteu a inversão?: " + !verdadeiro);   
    }
}
