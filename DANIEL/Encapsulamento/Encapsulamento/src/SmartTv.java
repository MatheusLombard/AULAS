//Encapsulamento é guardar para protejer o real objetivo é esconder
//previnir de mal uso

//Podemos encapsular variaveis e metodos

//ENCAPSULAMENTO DE  VARIAVEIS
//USO DE PRIVATE AO INVÉS DO PUBLIC
//SÓ POSSIVEL ACESSAR AS VARIAVEIS ATRAVÉS DE GETTERS E SETTERS

// ENCAPSULAMENTO DE MÉTODOS
// USO DE PRIVATE AO INVÉS DO PUBLIC
// METODO ACESSADO APENAS DENTRO DA PROPRIA CLASSE, E NÃO EM OUTRAS CLASSES

//METODO DE INSTANCIA E METODO DE CLASSE
//UM VEM DA INSTANCIA O OUTRO DO PARAMETRO ???????? ACHO QUE ISSO TA ERRADO


public class SmartTv{
    private int volume;
    private String marca, modelo;
    private boolean conectadaInternet;

    public SmartTv(){// SmartTv obj1 = new SmartTv();
        this.marca = "";
        this.modelo = "";
        this.conectadaInternet = false;
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


    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String valor){
        char aux = marca.charAt(0);
        boolean resp = Character.isUpperCase(aux);

        if(!valor.isEmpty() && resp){

            this.marca = valor;
        }else System.out.println("Marca não pode ser vazia e deve começar com a letra maiuscula");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String valor){
        if(!valor.isEmpty() || valor.length() <= 30){
            this.modelo = valor;
        } else System.out.println("ERRO: o modelo deve possuir menos de 30 caracteres");
    }

    public String getModelo() {
        return this.modelo;
    }


    public void abrirYoutube(){
        if (this.conectaInternet()){
            System.out.println("Abrindo o youtube");
        }else System.out.println("Sem conexão com a internect. VERIFIQUE SUA REDE");
    }
    private boolean conectaInternet(){
        System.out.println("Buscando sinal de wifi");
        System.out.println("Verificando credênciais");
        System.out.println("Autenticando IP no roteador");
        int random = (int) (Math.random() * 10);
        if (random < 5) {
            this.conectadaInternet = true;
            return true;
        }else{
            this.conectadaInternet = false;
            return false;
        }
    }

    public void aumentarVolume(int valor){
        setVolume(this.volume + valor);
    }

    public void diminuirVolume(int valor){
        setVolume(this.volume - valor);
    }


    public String info(){
        return "Informação sobre o objeto" + "\nVolume: " + this.volume + "\nMarca: " + this.marca + "\nModelo: " + this.modelo;
    }

}