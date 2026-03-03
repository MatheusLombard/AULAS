public class MainConta {
    public void main(){
        Conta c1 = new Conta(1, 123, "João Silva");

        c1.depositar(500);
        c1.sacar(200);

        System.out.println(c1.info());

        Conta c2 = new Conta(2, 321, "Maria Souza");
        c2.sacar(50);

        c1.desativarConta();
        c1.sacar(300);
        c1.desativarConta();
        System.out.println(c1.info());

    }
}
