public class ArCondicionado{
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;


    public ArCondicionado(){}
    public ArCondicionado(String marca, String modelo, int temperatura){
        setMarca(marca);
        setTemperatura(temperatura);
        this.modelo = modelo;
    }
    public void setTemperatura(int t){
        if(t < 16 || t > 30){
            System.out.println("Temperatura fora da faixa");
        }else {
            this.temperatura = t;
            System.out.println("Temperatura alterada para " + this.temperatura + "°C");
        }
    }

    public void setMarca(String marca) {
        if (marca.length() < 3) {
            System.out.println("Marca deve conter mais de 3 caracteres");
        } else this.marca = marca;
    }
    public void ativarModoTurbo(){
        boolean resCompressor = verificarCompressor();
        if(resCompressor){
            setTemperatura(16);
        }else System.out.println("Falha tecnica");
    }

    private boolean verificarCompressor(){
        return Math.random()*10 > 2;
    }

    public String info(){
        return "/////Informações/////" + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nTemperatura: " + this.temperatura + "\nLigado: " + (this.ligado ? "Sim" : "Não");
    }

}

