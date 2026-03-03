//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conta{
    public Number numeroConta, agencia;
    public String  nomeCliente;
    public float saldo;
    public boolean status;


    public Conta(Number numeroConta, Number agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }


    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Valor depositado: " +  valor);
        } else System.out.println("ERRO: a conta  " + this.numeroConta + " esta inativa");
    }

    public void sacar(float valor){
        if(this.status){
            if(this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("Valor sacado: " + valor);
            }else System.out.println("ERRO: a conta " + this.numeroConta + " não possui este saldo");
        } else System.out.println("ERRO: a conta " + this.numeroConta + " está inativa");
    }
    public void desativarConta(){
        if(this.status){
            if(this.saldo == 0){
                this.status = !this.status;
                System.out.println("Conta desativada com sucesso");
            }else System.out.println("ERRO: Esta conta " + this.numeroConta + " possui saldo, saque todo o dinheiro antes de destiva-la");
        } else System.out.println("ERRO: a conta " + this.numeroConta + " já está inativa");
    }

    public String info() {
        return "///////////////////INFORMAÇÕES SOBRE A CONTA " + this.numeroConta + "////////////////////" +
                "\nNr. Conta: " + this.numeroConta +
                "\nAgencia: " + this.agencia +
                "\nNome Cliente: " + this.nomeCliente +
                "\nSaldo: " + this.saldo +
                "\nStatus: " + (this.status ? "Ativa" : "Encerrada") +
                "\n///////////////////////////////////////////" ;
    }
}
