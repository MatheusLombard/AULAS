import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){

        Medico medico = new Medico(1, "Rodrigo", "Ortopedista");
        Paciente paciente = new Paciente(2, "Matheus", "192-192-199-99");

        LocalDateTime dataConsulta = LocalDateTime.of(2026, 03, 23, 23, 40, 00);
        Consulta consulta = new Consulta(dataConsulta, 230f, paciente, medico);
        System.out.println(consulta.toString());

    }
}
