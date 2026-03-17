import java.util.ArrayList;

public class Avaliacao {
    private String id, nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public Avaliacao() {
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso){
        Questao aux = new Questao(num, texto, peso);
        this.questoes.add(aux);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", questoes=" + questoes +
                '}';
    }
}
