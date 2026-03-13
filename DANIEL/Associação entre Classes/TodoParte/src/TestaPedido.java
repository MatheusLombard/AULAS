import java.util.Date;

public class TestaPedido {
    public static void main(String[] args){
        Cliente cli = new Cliente(100, "Fulano", "123", "Rua 10");

        Pedido p1 = new Pedido(1, new Date(), cli);

        System.out.println(p1.toString());

        Produto prod1 = new Produto(1, "Pc1", "PC gamer", 3000.f);
        Produto prod2 = new Produto(2, "Pc2", "PC escritorio", 1500.f);

        p1.adicionaItemPedido(1, 3, prod1);

        p1.adicionaItemPedido(2, 1, prod2);

        System.out.println(p1.toString());


    }




}
