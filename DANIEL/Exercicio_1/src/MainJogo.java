public class MainJogo {
    public void main(){
        Jogo jogo1 = new Jogo("Golden State", "Lakers");

        System.out.println(jogo1.toString());

        jogo1.registrarPontos("casa", 2);

        System.out.println(jogo1.toString());

        jogo1.registrarPontos("visitante", 3);

        jogo1.proximaQuarto();

        System.out.println(jogo1.toString());

    }
}
