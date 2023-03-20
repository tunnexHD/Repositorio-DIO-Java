public class Run {
    
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[]{new Car(), new Caminhao(), new Moto()};

        /* sobrescrito com polimorfismo
        * Trabalhamos com a classe mãe (Veiculos)
        */
        for (Veiculo veiculo: veiculos) {
            veiculo.rodas();
        }

        System.out.println("");

        // não houve polimorfismo em todos os casos.
        // Moto não sobrescreveu este método
        for (Veiculo veiculo: veiculos) {
            veiculo.portas();
        }

        System.out.println("");

        /*apenas sobrescrita (pura)
        * trabalhando diretamente a classe filha (Car)
        */
        Car carro = new Car();
        carro.rodas();
        carro.portas();

    }
}
