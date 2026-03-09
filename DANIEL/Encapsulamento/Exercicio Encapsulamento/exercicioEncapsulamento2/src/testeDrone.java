public class testeDrone {
    public static void main(String[] args) {

        Drone drone = new Drone("DJI Mini", 80);

        drone.setBateria(80);
        drone.setAltura(10);

        drone.decolar();

        drone.subir(20);

        drone.descer(5);

        drone.setAltura(150);
        drone.setBateria(150);

        System.out.println(drone.info());

    }
}
