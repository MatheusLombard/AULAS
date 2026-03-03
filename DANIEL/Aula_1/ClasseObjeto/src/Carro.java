import org.w3c.dom.ls.LSOutput;

public class Carro{
    //Variaveis
    public String marca, modelo;
    public float velocidade;
    public boolean motor;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.motor = false;
    }
    // Metodo da classe
    // Converte objeto em string
    public String toString() {
        return "Marca - " + this.marca + " Modelo - " + this.modelo +
                " Velocidade - " + this.velocidade + " Motor - " + (this.motor ? "ligado" : "desligado");
    }

    public void toggleMotor(){
        this.motor = !this.motor;

        this.velocidade = !this.motor ? 0 : this.velocidade;
        System.out.println(this.motor ? "Carro foi ligado" : "Carro foi Desligado");
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    public void acelerar(float acm){
        if(this.motor){
            this.velocidade = this.velocidade + acm;
            System.out.println("Acelerando: " + acm  + "\nVelocidade atual: " + this.velocidade);
        }
        else System.out.println("Não foi possivel acelerar");
    }
    public void frear(float acm){
        if (this.motor && acm <= this.velocidade) {
            this.velocidade = this.velocidade - acm;

            System.out.println("Freando: " + acm  + "\nVelocidade atual: " + this.velocidade);
        }
        else System.out.println("Não foi possivel frear");
    }
}
