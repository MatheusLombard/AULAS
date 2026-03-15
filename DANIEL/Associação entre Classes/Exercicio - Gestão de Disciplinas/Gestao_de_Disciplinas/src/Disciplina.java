import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;


    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes= new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes= new ArrayList<>();
    }

    public void matricularAluno(Aluno a){
        this.alunos.add(a);
    };
    public Avaliacao criarAvaliacao(String id, String nome){
        Avaliacao aux = new Avaliacao(id, nome);
        this.avaliacoes.add(aux);
        return this.avaliacoes.getFirst();
    };


    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", alunos=\n" + alunos +
                ", \navaliacoes=\n" + avaliacoes +
                '}';
    }
}
