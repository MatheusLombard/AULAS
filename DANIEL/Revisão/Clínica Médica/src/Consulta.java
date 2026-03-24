import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private float valorConsulta;
    private Paciente paciente;
    private Medico medico;

    public Consulta(LocalDateTime data, float valorConsulta, Paciente paciente, Medico medico) {
        this.data = data;
        this.valorConsulta = valorConsulta;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Consulta() {
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatoBr = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");

        return "Consulta{" +
                "data=" + data.format(formatoBr) +
                ", valorConsulta=" + valorConsulta +
                ", paciente=" + paciente +
                ", medico=" + medico +
                '}';
    }
}
