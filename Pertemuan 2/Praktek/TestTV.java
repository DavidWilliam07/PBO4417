public class TestTV {
    public static void main(String[] args) {
        manusia man1 = new manusia("Erik");
        System.out.println(man1.namaSaya());
        
        TV tvku = new TV();
        man1.beliTV(); // Membeli TV
        System.out.println(man1.cekTV()); // Mengoutputkan Cek TV
        man1.jualSemuaTV(); // Menjual semua TV
        System.out.println(man1.cekTV()); // Mengoutputkan Cek TV
    }
}