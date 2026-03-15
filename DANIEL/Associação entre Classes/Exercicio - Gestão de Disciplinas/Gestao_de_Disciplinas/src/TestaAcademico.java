import java.util.ArrayList;

public class TestaAcademico {
    public void main(String[] args){

        // INSTANCIANDO OS DOIS OBJETOS ALUNOS
        Aluno aluno1 = new Aluno(1, "Matheus", "123454", "Engenharia de Software");
        Aluno aluno2 = new Aluno(2, "Gabriely", "432156", "Engenharia de Produção");

        //INSTANCIANDO O OBJETO DISCIPLINA
        Disciplina dp1 = new Disciplina(1, "Programação Orientada a Objetos", "Daniel Pires");
        dp1.matricularAluno(aluno1);
        dp1.matricularAluno(aluno2);

        Avaliacao prova =  dp1.criarAvaliacao("AV1", "Prova Semestral");

        prova.adicionarQuestao(1, "Explique o conceito de encapsulamento.", 2.0f);
        prova.adicionarQuestao(2, "Qual a diferença entre herança e composição?", 3.0f);
        prova.adicionarQuestao(3, "Implemente uma classe exemplo em Java.", 5.0f);


        System.out.println(dp1.toString());
    }
}
