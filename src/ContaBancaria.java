// Classe que realiza as operações de criação de conta
public class ContaBancaria {

    int numero;
    String agencia;
    String nomeCliente;
    Float saldo;

    public ContaBancaria(int num, String agencia, String nomeCliente, Float saldo){
        this.numero = num;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String apresentarMensagem(){
        return "Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " +  this.numero + " e seu saldo " + this.saldo + " já está disponível para saque";
    }

}
