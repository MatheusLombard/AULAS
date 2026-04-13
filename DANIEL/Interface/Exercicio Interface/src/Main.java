public class Main {
    public static void main(String[] args){
        FechaduraEletronica fechadura = new FechaduraEletronica("123");

        fechadura.ligar();
        fechadura.desligar();

        fechadura.validarAcesso("1222");
        fechadura.validarAcesso("123");

        fechadura.ligar();
        fechadura.desligar();

        ///////////////////

        TermostatoSmart tSmart = new TermostatoSmart();

        tSmart.ligar();
        tSmart.desligar();

        System.out.println(tSmart.lerTemperatura());
        tSmart.ligar();
        System.out.println(tSmart.lerTemperatura());
    }
}
