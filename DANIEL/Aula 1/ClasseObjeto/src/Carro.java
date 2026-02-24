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
    public String toString(){
        return "Marca - " + this.marca + " Modelo - " + this.modelo +
                " Velocidade - " + this.velocidade + " Motor - " + this.motor ;
    }
}
