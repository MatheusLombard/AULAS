import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {
    public static void exibir(CanalNotificacao obj){
        System.out.println(obj.toString());
    }
    public static void main(String[] args) {

        Email email = new Email("Isa", "Teste de envio de mensagem", "teste de assunto");
        Sms sms = new Sms("Matheus", "Teste de envio de SMS", 1699944994);
        Whatsapp whats = new Whatsapp("Joginho", "Teste de Mensagem Whatsapp", "LIDA");


        ArrayList<CanalNotificacao> listaMensagens = new ArrayList<>();
        listaMensagens.add(email);
        listaMensagens.add(sms);
        listaMensagens.add(whats);

        for (CanalNotificacao canal: listaMensagens){
            exibir(canal);
        }

    }
}