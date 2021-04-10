package transportasi;

public class Mobil {
    public String warna;
    public int tahunProduksi;
    public int ubahGigi;
    public boolean on = false;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
}