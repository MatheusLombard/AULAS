import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args) {
        Passageiro pas1 = new Passageiro("123", "Fulano");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 07, 14, 10, 00, 40);
        Voo voo1 = new Voo(10, "Franca", "Restinga", data);
        System.out.println(voo1.toString());

        LocalDateTime dataReserva = LocalDateTime.of(2026, 03, 18, 00, 30, 40);

        Reserva res1 = new Reserva(12, dataReserva, 2, voo1, pas1);
        System.out.println(res1.toString());
    }
}
