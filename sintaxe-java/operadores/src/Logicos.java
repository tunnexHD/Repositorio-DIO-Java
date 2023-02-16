public class Logicos {
  public static void main(String[] args) {

	boolean condicao1 = true;
	boolean condicao2 = false;

	// && representa e
	// || representa ou
	if(condicao1 && condicao2){
		System.out.println("as duas condições são verdadeiras");
	}

	if(condicao1 && (7 > 4)){
		System.out.println("Condição 1 e a expressão são verdadeiras");
	}
    
	if(condicao1 || condicao2){
		System.out.println("uma das condições é verdadeira");
	}

}
}