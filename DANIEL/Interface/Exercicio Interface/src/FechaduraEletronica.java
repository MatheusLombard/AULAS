import java.util.Objects;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel{
    private boolean ligado, acessoValido;
    private String senha;


    public FechaduraEletronica(String senha) {
        this.ligado = false;
        this.acessoValido = false;
        this.senha = senha;
    }

    public void validarAcesso(String senha) {
        if (this.senha.equals(senha)){
            this.acessoValido = true;
            System.out.println("Acesso válidado");
        }
        else System.out.println("Senha incorreta");
    }

    @Override
    public void ligar() {
        if(this.acessoValido){
            this.ligado = true;
            System.out.println("Ligando...");
        }else System.out.println("Você não esta com o acesso valido");
    }

    @Override
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            this.acessoValido = false;
            System.out.println("Desligando...");
        }else System.out.println("Dispositivo já está desligado");
    }
}
