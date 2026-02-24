public class TestaCarro {
    public static void main(String args[]){
        //CRIA UMA INSTANCIA DA CLASSE CARRO
        Carro obj1 = new Carro("Fiat", "Uno");
        obj1.toggleMotor();
        //obj1.marca = "Fiat";
        //obj1.modelo = "Uno";
        //obj1.velocidade = 0;
        //obj1.motor = false;

        System.out.println(obj1.toString());

        System.out.println("////////////////////////////////////");
        Carro obj2 = new Carro("GM", "onix");
        obj2.toggleMotor();
        obj2.acelerar(20);
        obj2.acelerar(20);
        obj2.frear(20);
        obj2.frear(20);

        obj2.toggleMotor();
        //obj2.marca = "GM";
        //obj2.modelo = "Onix";
        //obj2.velocidade = 0;
        //obj2.motor = false;

        System.out.println(obj2.toString());
        System.out.println("////////////////////////////////////");

        Carro obj3 = new Carro("Tesla", "CyberTruck");
        obj3.toggleMotor();
        obj3.toggleMotor();
        //obj3.marca = "Tesla"
        //obj3.modelo = "CyberTruck";
        //obj3.velocidade = 550;
        //obj3.motor = true;

        System.out.println(obj3.toString());
    }

}

//PLAY -> ACIONA O JDK COMPILA + INTERPRETA


