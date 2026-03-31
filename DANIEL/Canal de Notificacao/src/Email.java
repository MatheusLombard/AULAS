public class Email extends CanalNotificacao {
    private String assunto;

    public Email() {
        super();
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mail para " + super.getDestinatario() + " com o assunto " + this.assunto + ": " + super.getMensagem());
    }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Email{" +
                super.toString() +
                "assunto='" + assunto + '\'' +
                '}';
    }
}
