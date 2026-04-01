public class Main {
    public static void main(String[] args){
        Edificio edificio = new Edificio("Edificio 1", "Avenida");
        edificio.construirApartamento(10, 2);
        edificio.construirApartamento(10, 2);

        System.out.println(edificio.toString());
    }
}
