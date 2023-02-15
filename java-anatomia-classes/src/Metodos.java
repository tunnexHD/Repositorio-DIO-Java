public class Metodos {
    
public static void main(String[] args) {
    String primeiroNome = "Matheus";
    String segundoNome = "Drumond";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.print(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Qual o seu nome? " + primeiroNome.concat(" ").concat(segundoNome);
}

}
