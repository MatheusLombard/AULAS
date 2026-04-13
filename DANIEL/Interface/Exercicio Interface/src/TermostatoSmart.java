import java.util.Random;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura{
    private boolean ligado;

    public TermostatoSmart() {
        this.ligado =  false;
    }

    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Ligando...");
        }else System.out.println("Dispositivo já esta ligado");
    }

    @Override
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            System.out.println("Desligando...");
        }else System.out.println("Dispositivo já esta desligado");
    }

    @Override
    public double lerTemperatura() {
        if(this.ligado) {
            System.out.println("Buscando regiao...");
            System.out.println("Buscando cidade...");
            System.out.println("Buscando bairro...");
            System.out.println("Buscando temperatura...");
            return Math.random()*30;
        }else return -1;
    }
}
