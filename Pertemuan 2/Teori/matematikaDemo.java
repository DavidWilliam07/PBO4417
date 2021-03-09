import java.util.Scanner;

class Matematika {
    int angka1;
    int angka2;

    // fungsi tambah
    static int tambah(int angka1, int angka2){
        int hasil = angka1 + angka2;
        return hasil;
    }

    // fungsi kurang
    static int kurang(int angka1, int angka2){
        int hasil = angka1 - angka2;
        return hasil;
    }

    // fungsi bagi
    static double bagi(int angka1, int angka2){
        double hasil = angka1 - angka2;
        return hasil;
    }

    // fungsi kali
    static int kali(int angka1, int angka2){
        int hasil = angka1 - angka2;
        return hasil;
    }
}


public class matematikaDemo {
    public static void main(String[] args){
	    // Membuat object
	    Matematika matematika = new Matematika();
        
        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        matematika.angka1 = keyboard.nextInt();
        System.out.print("Masukkan angka kedua : ");
        matematika.angka2 = keyboard.nextInt();
        // Output Penjumlahan
        System.out.println("Hasil Penjumlahan : " + Matematika.tambah(matematika.angka1, matematika.angka2));
        // Output Pengurangan 
        System.out.println("Hasil Pengurangan : " + Matematika.kurang(matematika.angka1, matematika.angka2));
        // Output Pembagian
        System.out.println("Hasil Pembagian : " + Matematika.bagi(matematika.angka1, matematika.angka2));
        // Output Perkalian
        System.out.println("Hasil Perkalian : " + Matematika.kali(matematika.angka1, matematika.angka2));
    }
}