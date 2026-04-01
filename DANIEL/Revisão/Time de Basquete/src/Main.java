public class Main {
    public static void main(String[] args) {
        Atleta atleta = new Atleta(1, "Matheus", "Ala-Armador");
        Atleta atleta2 = new Atleta(2, "Jorge", "Ala-Pivo");
        Atleta atleta3 = new Atleta(3, "Rodrigo", "Ala");
        Time time = new Time(1, "GSW", "Steve Kerr");

        time.contratarAtleta(atleta);
        time.contratarAtleta(atleta2);
        time.contratarAtleta(atleta3);

        System.out.println(time.toString());

        time = null;

        System.out.println(atleta3.toString());
    }
}
