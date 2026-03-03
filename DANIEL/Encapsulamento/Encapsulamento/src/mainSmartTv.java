public class mainSmartTv {
    public void main(){
        SmartTv obj1 = new SmartTv();
        obj1.setVolume(99);


        System.out.println("Exibindo volume com getter: " + obj1.getVolume());

        System.out.println(obj1.info());


        SmartTv obj2 = new SmartTv("Samsung", "QLed 32", 0);
        obj2.aumentarVolume(10);
        obj2.diminuirVolume(11);
        System.out.println(obj2.info());

        obj2.abrirYoutube();
    }
}
