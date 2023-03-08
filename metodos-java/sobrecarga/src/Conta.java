public class Conta {

    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(8,7,9);
        Quadrilatero.area(5f,5f);//não basta mudar o nome do parâmento para sobrecarregar o método. Neste caso, alteramos o tipo do parâmetro

    }
}