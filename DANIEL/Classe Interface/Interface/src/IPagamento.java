public interface IPagamento{
    // Contrato: quem implementar a interface, deve implementar estes metodos

    public void autorizar(float valor);
    public void exibirComprovante();


}