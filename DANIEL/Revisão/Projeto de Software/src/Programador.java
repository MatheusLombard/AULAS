public class Programador{
    private int id;
    private String nome, linguagem;

    public Programador(int id, String nome, String linguagem) {
        this.id = id;
        this.nome = nome;
        this.linguagem = linguagem;
    }

    public Programador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                '}';
    }
}