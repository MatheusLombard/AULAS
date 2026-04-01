import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void construirApartamento(int num, int andar){
        Apartamento aux = new Apartamento(num, andar);
        this.apartamentos.add(aux);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
