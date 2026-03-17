import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int nr_voo;
    private String origem, destino;
    private LocalDateTime data;

    public Voo(int nr_voo, String origem, String destino, LocalDateTime data) {
        this.nr_voo = nr_voo;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getNr_voo() {
        return nr_voo;
    }

    public void setNr_voo(int nr_voo) {
        this.nr_voo = nr_voo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Voo{" +
                "nr_voo=" + nr_voo +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data.format(formatoBr) +
                '}';
    }
}
