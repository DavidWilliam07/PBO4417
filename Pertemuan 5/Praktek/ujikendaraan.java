public class ujikendaraan {
    public static void main(String args[]) {
        vehicle kendaraan = new vehicle();
        bicycle sepeda = new bicycle();
        motorvehicle motor = new motorvehicle();

        kendaraan.gostraight();
        kendaraan.turnleft();
        kendaraan.turnright();

        sepeda.ringbell();
    }
}