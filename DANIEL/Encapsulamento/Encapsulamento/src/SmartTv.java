//Encapsulamento é guardar para protejer o real objetivo é esconder
//previnir de mal uso

//Podemos encapsular variaveis e metodos

public class SmartTv{
    private int volume;
    private String marca, modelo;

    public SmartTv(){// SmartTv obj1 = new SmartTv();
         }
    public SmartTv(String marca, String modelo, int volume){ // SmartTv obj2 = new SmartTv("Samsung", "QLed 32", 0);
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
    }

    public void setVolume(int valor){
        if (valor >= 0 && valor <= 100 ){
            this.volume = valor;
        }else System.out.println("O volume precisa ser maior ou igual a 0 e menor ou igual a 100");
    }
    public String info(){
        return "Informação sobre o objeto" + "\nVolume: " + this.volume + "\nMarca: " + this.marca + "\nModelo: " + this.modelo;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String valor){
        if(!valor.isEmpty()){
            this.marca = valor;
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String valor){
        if(!valor.isEmpty() || valor.length() > 30){
            this.modelo = valor;
        } else System.out.println("ERRO: o modelo deve possuir menos de 30 caracteres");
    }

    public String getModelo() {
        return this.modelo;
    }

}