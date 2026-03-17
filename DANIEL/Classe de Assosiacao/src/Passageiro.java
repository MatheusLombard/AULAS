// Classse de Associação(n:n)
// quando possui um relacionamento N para N é preciso criar uma classe de associação
public class Passageiro{
    private String cpf, nome;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Passageiro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
}