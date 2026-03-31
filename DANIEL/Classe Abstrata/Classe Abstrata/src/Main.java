// não podem ser instanciadas
// servem de modelo para as filhas(subclasses)
//pode possuir metodos abstratos(não podem ser implmementados)
//metodos abstratos são implementadados, obrigatóriamente, nas filhas.
public abstract class Desenvolvedor{
    protected String nome;
    protected String linguagem;
    protected float salarioBase;

    public Desenvolvedor(){

    }

    public Desenvolvedor(String nome, String linguagem, float salarioBase) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salarioBase = salarioBase;
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

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public abstract void codar();
    public float calcularBonus(){
        return this.salarioBase * 0.5f;
    }
}