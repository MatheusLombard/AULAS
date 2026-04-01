import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro(1, "O pequeno principe", "Antonie");
        Leitor leitor = new Leitor(1, "Matheus");

        LocalDateTime dataEmprestimo = LocalDateTime.of(2026, 03, 23, 23, 52, 00);
        LocalDateTime dataDevolucao = LocalDateTime.of(2026, 04, 23, 23, 52, 00);

        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, leitor);
        System.out.println(emprestimo.toString());
    }
}
