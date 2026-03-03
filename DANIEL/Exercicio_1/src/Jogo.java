public class Jogo {
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;

    public Jogo(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.periodoQuarto = 1;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
    }

    public void registrarPontos(String time, int tipo){
        if (time.equals("casa")){
            this.pontosCasa += tipo;
        } else this.pontosVisitante += tipo;
    }
    public void proximaQuarto(){
        if (this.periodoQuarto != 4){
            this.periodoQuarto++;
        } else System.out.println("O jogo TERMINOU");
    }
    public String toString(){
        return "TIME " + this.nomeTimeCasa + ": " + this.pontosCasa + " pontos X TIME " + this.nomeTimeVisitante + ": " + this.pontosVisitante + " pontos \n" +
                "Periodo: " + this.periodoQuarto;
    }
}
