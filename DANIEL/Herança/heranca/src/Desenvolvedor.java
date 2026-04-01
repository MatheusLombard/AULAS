//ASSOCIAÇÃO
//GENERALIZAÇÃO --> SUPERCLASSE - PAI
//ESPECIALIZAÇÃO --> SUBCLASSE - FILHO

// + VISIBILIDADE PUBLICA
// - VISIBILIDADE PRIVADA
// # VISIBILIDADE PROTEGIDA - PUBLICA PARA OS FILHOS E PRIVADAS PARA AS DEMAIS CLASSES

public class Desenvolvedor{
    protected String nome;
    protected String liguagem;
    protected float salario;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String liguagem, float salario) {
        this.nome = nome;
        this.liguagem = liguagem;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLiguagem() {
        return liguagem;
    }

    public void setLiguagem(String liguagem) {
        this.liguagem = liguagem;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void codar(){
        System.out.println("Desenvolvedor escrevendo código");
    }
    public float calcularBonus(){
        return this.salario * 0.05f;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", liguagem='" + liguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}