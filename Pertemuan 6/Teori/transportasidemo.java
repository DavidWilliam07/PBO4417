import java.util.Scanner;
import transportasi.*;

public class transportasidemo {
    public static void main(String[]args) {
        // file bicycle.java
        bicycle objectBicycle = new bicycle();
        objectBicycle.speed = 10;
        objectBicycle.gear = 2;
        objectBicycle.speedUp(10);
        objectBicycle.changeGear(2);

        // file Mobil.java
        Mobil mobilku = new Mobil();
        //Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        //Memanggil atribut dan memberi nilai
        System.out.print("\nMasukkan Warna : ");
        mobilku.warna = keyboard.nextLine();
        System.out.print("Masukkan Tahun : ");
        mobilku.tahunProduksi = keyboard.nextInt();
        mobilku.ubahGigi = 0;
        System.out.println("Ubah Gigi: "+ mobilku.ubahGigi);
        mobilku.turnOff();
        System.out.println(" Press any key to continue... ");
    }
}