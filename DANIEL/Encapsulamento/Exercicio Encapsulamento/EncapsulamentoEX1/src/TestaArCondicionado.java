public class TestaArCondicionado {
    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado("AOC", "Dual Inverter", 22);

        ar.setTemperatura(25);

        ar.setTemperatura(35);

        ar.setMarca("A");

        ar.ativarModoTurbo();


        System.out.println(ar.info());
    }
}
