public class manusia {
    String nama = "noname"; // Default nama is noname
    boolean punyaTV = false; // Default punyaTV is false

    public manusia(){}
    public manusia(String nama){
        this.nama = nama;
    }
    public String namaSaya(){
        return nama;
    }
    public void beliTV(){
        this.punyaTV = true;
    }
    public void jualSemuaTV(){
        punyaTV = false;
    }
    public boolean cekTV(){
        return punyaTV;
    }
}