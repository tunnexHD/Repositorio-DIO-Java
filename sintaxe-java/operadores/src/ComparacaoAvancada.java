public class ComparacaoAvancada {
    public static void main(String[] args) {
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //usado para comparações numéricas

        nome2 = new String("JAVA");

        System.out.println(nome1 == nome2);//imprime falso mesmo os objetos sendo iguais
                        
        //para textos e objetos, utiliza-se o equals
        System.out.println(nome1.equals(nome2));
         
        
    }
}
