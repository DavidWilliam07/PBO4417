public class vehicle {
    public double speed = 0; // Nilai default speed adalah 0
    public String color = "orange"; // Nilai default color adalah orange

    public vehicle(){}
    public void gostraight(){
        System.out.println("Maju");
    }
    public void turnleft(){
        System.out.println("Belok Kiri");
    }
    public void turnright(){
        System.out.println("Belok Kanan");
    }
}

class bicycle extends vehicle{
    public bicycle(){}
    public void ringbell(){
        System.out.println("Kring...kring..");
    }
}

class motorvehicle extends vehicle{
    public int sizeofEngine = 1; // Nilai default sizeofEngine adalah 1
    public String licencePlate = "H 1 IDN";
    
    public motorvehicle(){}
    public motorvehicle(int sizeofEngine, String licencePlate){}
    public int getSizeofEngine(){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}