import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; //ASSOCIAÇÃO TODO-PARTE
    private ArrayList<ItemPedido> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList<>(); //aloca espaço na memoria para vetor
    }
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente; //AGREGAÇÃO
        this.itensPedido = new ArrayList<>();
    }

    public void adicionaItemPedido(int id, int qtde, Produto produto) {
        System.out.println("Passou por aqui? Passou");
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        this.itensPedido.add(aux);
        System.out.println("Item adicionado com sucesso");
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente +
                ", Items= \n" + itensPedido +
                '}';
    }
}
