public class Drone{
    private String drone;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(String drone, int bateria) {
        this.drone = drone;
        setBateria(bateria);
        this.altura = 0;
        this.emVoo = false;
    }

    public void setAltura(float altura) {
        if(altura > 0 && altura < 120){
            this.altura = altura;
            System.out.println("Altura regulada para " + this.altura + " metros");
        } else System.out.println("Altura inválida!!!!");
    }

    public void setBateria(int bateria) {
        if(bateria > 0 && bateria < 100){
            this.bateria = bateria;
            System.out.println("Bateria do drone em " + this.bateria + "%");
        }else System.out.println("Valor para bateria invalido!!!");
    }

    public void decolar(){
        if(bateria > 20 && testarMotores()){
            System.out.println("Os motores estão prontos...");
            System.out.println("Decolando...");
            this.emVoo = true;
            setAltura(2);
        }else {
            System.out.println("Falha na decolagem!");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando Hélices...");
        System.out.println("Calibrando GPS...");
        return Math.random()*10 < 8;
    }

    public void subir(float x){
        if(this.emVoo){
            System.out.println("Subindo..");
            setAltura(this.altura + x);
        }

    }
    public void descer(float x){
        if(this.emVoo){
            System.out.println("Descendo...");
            setAltura(this.altura - x);
        }
    }

    public String info() {
        return "\n--- INFORMAÇÕES DO DRONE ---"
                + "\nModelo: " + this.drone
                + "\nAltura: " + this.altura + " m"
                + "\nBateria: " + this.bateria + "%"
                + "\nEm voo: " + (this.emVoo ? "Sim" : "Não");
    }

}