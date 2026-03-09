public class TestaArCondicionado {
    public static void main(String[] args) {

        // Criando um objeto do ar condicionado
        ArCondicionado ar = new ArCondicionado("AOC", "Dual Inverter", 22);

        // Testando alteração de temperatura
        ar.setTemperatura(25);

        // Testando temperatura fora da faixa
        ar.setTemperatura(35);

        // Testando marca inválida
        ar.setMarca("A");

        // Testando modo turbo
        ar.ativarModoTurbo();


        System.out.println(ar.info());
    }
}
