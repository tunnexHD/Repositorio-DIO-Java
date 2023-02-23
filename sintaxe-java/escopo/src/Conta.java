public class Conta {
        //variavel da classe conta
        double saldo=100.0;
        
        public void sacar(Double valor) {
            //variavel local de método
            double novoSaldo = saldo - valor;
            System.out.println("Novo Saldo: " + novoSaldo); //essa variável só pode ser acessada dentro do escopo do método "sacar"
        }
 
        public void imprimirSaldo(){
            //disponível em toda classe
            System.out.println("Saldo Atual: " + saldo);
            /*somente o método sacar conhece a variavel "novoSaldo"
            System.out.println(novoSaldo) não se aplica aqui;*/
        }

       //caso queira que o valor depositado/sacado altere o saldo original
        /*public void depositar(double valor) {
            saldo += valor;
            System.out.println("Novo Saldo: " + saldo);
        }
        
        public void sacar(double valor) {
            saldo -= valor;
            System.out.println("Novo Saldo: " + saldo);
        }*/
}



// No terminal execute o comando abaixo

