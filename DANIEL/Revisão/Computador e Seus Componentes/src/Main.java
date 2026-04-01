public class Main {
    public static void main(String[] args){

        Computador computador = new Computador(1, "Lenovo");
        computador.setProcessador("AMD", "Ryzen 5600", 3200f);


        System.out.println(computador.toString());
    }
}
