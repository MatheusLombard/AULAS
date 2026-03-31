public class Sms extends CanalNotificacao {
    private int numeroTelefone;

    public Sms() {
        super();
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para o número" + this.numeroTelefone + ":" + super.getMensagem());
    }

    public Sms(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Sms{" +
                super.toString() +
                "Numero do Telefone ='" + this.numeroTelefone + '\'' +
                '}';
    }
}

