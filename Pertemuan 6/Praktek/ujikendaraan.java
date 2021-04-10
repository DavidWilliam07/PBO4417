public class ujikendaraan {
    public static void main(String args[]) {
        vehicle kendaraan = new vehicle();
        bicycle sepeda = new bicycle();
        motorvehicle motor = new motorvehicle();
        motorcycle sepedamotor = new motorcycle();
        car mobil = new car();

        kendaraan.gostraight();
        kendaraan.turnleft();
        kendaraan.turnright();

        sepeda.ringbell();

        sepedamotor.setgearfoot(1);
        System.out.println("Gigi anda saat ini : " + sepedamotor.getgearfoot());

        mobil.setseatbelt(true);
        System.out.println("Seatbelt anda saat ini : " + mobil.getseatbelt());
        
        KendaraanMelaju();
    }
    
    public static void KendaraanMelaju() {
        vehicle coba = new vehicle();
        coba.gostraight();
    }
}