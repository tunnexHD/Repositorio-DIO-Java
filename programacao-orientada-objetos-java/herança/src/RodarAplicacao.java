/*Exemplo:
 * Upcast: Veiculo é a superclasse, carro é um subtipo dessa classe
 * Downcast
 */

public class RodarAplicacao {
    
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo();

        //Ex upcast
        Veiculo car = new Car();
        Veiculo caminhao = new Caminhao();
        Veiculo moto = new Moto();

        //Ex downcast - evitar utilizar este conceito
       // Car car1 = (Car) new Veiculo();


    }
}
