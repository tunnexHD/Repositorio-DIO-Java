public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;
    
    public void ligar(){
        ligada = true;
        System.out.println("TV ligou");
    }
    public void desligar(){
        ligada = false;
        System.out.println("TV desligou");
    }

    public void aumentarCanal(){
        if(ligada){
            canal++;
            System.out.println("Aumentou o canal. Novo canal: " + canal);}
        else {
            System.out.println("TV desligada");}
    }
    public void diminuirCanal(){
        if(ligada){
            canal--;
            System.out.println("Diminuiu o canal. Novo canal: " + canal);}
        else{
            System.out.println("TV desligada");}
    }

    public void aumentarVolume(){
        if(ligada){
            volume++;
            System.out.println("Aumentou o volume. Novo volume: " + volume);}
        else{
            System.out.println("TV desligada");}
    }
    public void diminuirVolume(){
        if(ligada){
            volume--;
            System.out.println("Diminuiu o volume. Novo volume: " + volume);}
        else{
            System.out.println("TV desligada");}
    }
}
