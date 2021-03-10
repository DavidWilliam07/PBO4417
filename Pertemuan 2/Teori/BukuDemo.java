import java.util.Scanner;
class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
}
public class BukuDemo {
    public static void main(String[] args){
        //Membuat objek
        Buku bukuku= new Buku();
        String aksi;

        //Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.print("Judul : ");
            bukuku.judul = keyboard.nextLine();
            System.out.print("Pengarang : ");
            bukuku.pengarang = keyboard.nextLine();
            System.out.print("Penerbit : ");
            bukuku.penerbit = keyboard.nextLine();
            System.out.print("Tahun : ");
            bukuku.tahun = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(bukuku.judul + ", " + bukuku.penerbit + ", " + bukuku.pengarang + ", " + bukuku.tahun);
            System.out.print("Mau lanjut ? (y/n) ");
            aksi = keyboard.nextLine();
            // cek jawabnya, kalu ya maka berhenti
            if (aksi.equalsIgnoreCase("n")){
                running = false;
            }
        }
    } 
}