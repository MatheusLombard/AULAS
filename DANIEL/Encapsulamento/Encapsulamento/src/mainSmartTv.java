public class mainSmartTv {
    public void main(){
        SmartTv obj1 = new SmartTv();
        obj1.setVolume(99);


        System.out.println("Exibindo volume com getter: " + obj1.getVolume());


        SmartTv obj2 = new SmartTv("Samsung", "QLed 32", 0);
    }
}
