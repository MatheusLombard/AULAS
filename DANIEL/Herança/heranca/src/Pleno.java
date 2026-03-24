public class Pleno extends Desenvolvedor {
    private int projEntr;

    public Pleno() {
        super();
    }

    public Pleno(String nome, String liguagem, float salario, int projEntr) {
        super(nome, liguagem, salario);
        this.projEntr = projEntr;
    }

    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntr=" + projEntr +
                '}';
    }
    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo código e fazendo Code Review");
    }
    @Override
    public float calcularBonus(){
        return super.calcularBonus() + 2000;
    }
}
