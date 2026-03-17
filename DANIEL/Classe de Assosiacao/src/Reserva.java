import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Reserva {
    private int codigo;
    private LocalDateTime data;
    private int poltrona;
    private Voo voo;
    private Passageiro passageiro;

    public Reserva(int codigo, LocalDateTime data, int poltrona, Voo voo, Passageiro passageiro) {
        this.codigo = codigo;
        this.data = data;
        this.poltrona = poltrona;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");

        return "Reserva{" +
                "codigo=" + codigo +
                ", data=" + data.format(formatoBr) +
                ", poltrona=" + poltrona +
                ", voo=" + voo +
                ", passageiro=" + passageiro +
                '}';
    }
}
