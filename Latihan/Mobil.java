

public class Mobil {
        String warna;
        String merk;
    public Mobil(){
        this.warna ="";
        this.merk = "";
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    void beriWarna(){
        System.out.println("Warna mobil ini adalah"+warna);
    }
    void beriMerk(){
        System.out.println("Merk Mobil ini adalah"+merk);
    }

}
