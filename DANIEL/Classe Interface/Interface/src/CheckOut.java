public class CheckOut {
    public static void main(String[] args){
        IPagamento seletor;// Objeto interface

        seletor = new CartaoCredito("121121221");
        seletor.autorizar(400);
        seletor.exibirComprovante();

        seletor = new Pix("19191919");
        seletor.autorizar(500);
        seletor.exibirComprovante();
    }
}
