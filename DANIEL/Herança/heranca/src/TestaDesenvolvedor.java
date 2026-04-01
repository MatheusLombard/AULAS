import java.util.ArrayList;

public class TestaDesenvolvedor {
    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus: " + camaleao.calcularBonus());
    }
    public static void main(String[] args){
        Desenvolvedor dev1 = new Desenvolvedor();
        ///////////
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);
        /////////////

        /////////////
        Pleno pl1 = new Pleno("Beltrano", "Java", 5000, 5);
        exibir(pl1);
        ////////////
        Senior se1 = new Senior("Ciclano", "Java", 6000, 3000f);
        exibir(se1);

        // Cria vetor de desenvolvedor
        ArrayList<Desenvolvedor> devs = new ArrayList<Desenvolvedor>();
        //adiciona devs

        devs.add(jr1);
        devs.add(pl1);
        devs.add(se1);

        //percorra vetor para cada dev de devs
        for(Desenvolvedor dev: devs){
            exibir(dev); //chama exibir para cada DEV
        }
    }
}
