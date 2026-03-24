import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo, dataDevolucaoprevista;
    private Livro livro;
    private Leitor leitor;

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoprevista, Livro livro, Leitor leitor) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoprevista = dataDevolucaoprevista;
        this.livro = livro;
        this.leitor = leitor;
    }

    public Emprestimo() {
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDataDevolucaoprevista() {
        return dataDevolucaoprevista;
    }

    public void setDataDevolucaoprevista(LocalDateTime dataDevolucaoprevista) {
        this.dataDevolucaoprevista = dataDevolucaoprevista;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo.format(formatoBr) +
                ", dataDevolucaoprevista=" + dataDevolucaoprevista.format(formatoBr) +
                ", livro=" + livro.getTitulo() +
                ", leitor=" + leitor +
                '}';
    }
}
