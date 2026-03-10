import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; //ASSOCIAÇÃO TODO-PARTE

    public Pedido() {
    }
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente; //AGREGAÇÃO
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
                ", cliente=" + cliente +
                '}';
    }
}
