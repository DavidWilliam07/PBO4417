import java.util.Scanner;
class Mobil2 {
    String warna;
    int tahunProduksi;
    int ubahGigi;
    boolean on = false;

    public void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }
}
public class MobilDemo2 {
    public static void main(String[] args){
        //Membuat objek
        Mobil2 mobilku = new Mobil2();
        //Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        //Memanggil atribut dan memberi nilai
        System.out.print("Masukkan Warna : ");
        mobilku.warna = keyboard.nextLine();
        System.out.print("Masukkan Tahun : ");
        mobilku.tahunProduksi = keyboard.nextInt();
        mobilku.ubahGigi = 2;
        System.out.println("Ubah Gigi: "+ mobilku.ubahGigi);
        mobilku.turnOff();
        System.out.println(" Press any key to continue... ");
    }
    
}