public class CartaoCredito implements IPagamento{
    private String nrCartao;

    public CartaoCredito(String nrCartao) {
        this.nrCartao = nrCartao;
    }

    public String getNrCartao() {
        return nrCartao;
    }

    public void setNrCartao(String nrCartao) {
        this.nrCartao = nrCartao;
    }

    @Override
    public void autorizar(float valor) {
        System.out.println("Verificando limite do cartao " + this.nrCartao);
        System.out.println("Pagamento de R$ " + valor + " autorizado via crédito");

    }
    @Override
    public void exibirComprovante() {
            System.out.println("Comprovante enviado para o seu email");
    }
}
