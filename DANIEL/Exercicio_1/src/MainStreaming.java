public class MainStreaming {
    public void main(){
        Streaming c1 = new Streaming("Matheus", "Básico");
        c1.assistirFilme("Avatar 3");
        System.out.println(c1.toString());

        Streaming c2 = new Streaming("Maria", "Premium");
        c2.cancelarAssinatura();

        System.out.println(c2.toString());
    }
}
