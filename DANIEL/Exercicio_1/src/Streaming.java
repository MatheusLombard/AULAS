public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido;
    public  float mensalidade;
    public boolean ativo;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        if (this.plano == "Básico"){
            this.mensalidade = 25.902f;
        } else if (this.plano == "Premium") {
            this.mensalidade = 45.90f;
        } else this.mensalidade = 60.902f;
    }

    public void assistirFilme(String nomeFilme) {
        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assitindo: " + nomeFilme);
        }else System.out.println("É necessário realizar o pagamento da fatura");
    }

    public void cancelarAssinatura(){
        if(this.ativo){
            this.ativo = !this.ativo;
            System.out.println("Conta desativada com sucesso");
        }else System.out.println("A conta já esta desativada");
    }
    public String toString(){
        return "///////////////////INFORMAÇÕES SOBRE A CONTA////////////////////" +
                "\nUsuário: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nStatus: " + (this.ativo ? "Ativo" : "Suspenso") +
                "\nUltimo Filme Assistido: " + this.ultimoFilmeAssistido +
                "\nMensalidade: " + this.mensalidade +
                "\n///////////////////////////////////////////";
    }
}
