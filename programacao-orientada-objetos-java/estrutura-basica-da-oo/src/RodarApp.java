public class RodarApp {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Gol");
        carro1.setCapacidadeTanque(42);

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade do Tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Valor (R$) para completar o Tanque: " + carro1.totalValorTanque(5.29));

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println("\nModelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do Tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Valor (R$) para completar o Tanque: " + carro2.totalValorTanque(5.39));



    }

}
