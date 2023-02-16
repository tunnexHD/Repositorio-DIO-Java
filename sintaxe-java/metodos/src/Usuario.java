public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        /*System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Canal atual?: " + smartTv.canal);
        System.out.println("Volume atual?: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligou?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV desligou?: " + !smartTv.ligada);*/

    
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        
        System.out.println("Status da TV: " + (smartTv.ligada ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Status da TV: " + (smartTv.ligada ? "Ligada" : "Desligada"));

    }
}
