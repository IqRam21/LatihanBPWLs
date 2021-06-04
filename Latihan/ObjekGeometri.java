java.util.*;

public class ObjekGeometri {
    String warna;
    boolean terisi;
    int Date(){
      int tanggalDiciptakan;
    }
    public ObjekGeometri(){
        this.warna = " ";
        this.terisi = true;
    }
    public ObjekGeometri(String warna,boolean terisi){
        this.warna = warna;
        this.terisi = terisi;
    }
    public String dapatWarna(){
        return warna;
    }
    public void tetapkanWarna(String color){
        System.out.println("Isi Warna adalah : "+color);
    }
    public boolean apaTerisi(){
        return terisi;
    }
    public void tetapkanTerisi(boolean filled){
        System.out.println("Isi Warna adalah : "+filled);
    }
    public String keString(){
        
    }
}
class Lingkaran extends ObjekGeometri{
    public double radius;
    public Lingkaran(){
        this.radius =0;
    }
    public Lingkaran(double radius){
        this.radius =radius;
    }
    public double dapatRadius(){
        return radius;
    }
    public void tetapkanRadius(double radius){
        this.radius = radius = 20;
    }
    public double dapatLuas(){
        return 3.14*radius*radius;
    }
    public double dapatKeliling(){
        return 3.14*2*radius;
    }
    public double dapatDiameter(){
        
    }
}
class PersegiPanjang extends ObjekGeometri{
    public double lebar,tinggi;
    public PersegiPanjang(){
        this.lebar = this.tinggi = 0;
    }
    public PersegiPanjang(double lebar, double tinggi){
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public PersegiPanjang(double lebar, double tinggi,String warna,boolean terisi){
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.warna = warna;
        this.terisi = true;
    }
    public double dapatLebar(){
        return lebar;
    }
    public double dapatTinggi(){
        return tinggi;
    }
    public void tetapkanTinggi(double tinggi){
        this.tinggi = tinggi = 10;
    }
    public void tetapkanLebar(double lebar){
        this.lebar = lebar = 5;
    }
    public double dapatLuas(){
        return lebar*tinggi;
    }
    public double dapatPerimeter(){

    }
}
class testObjectGeometri{
    public static void main(String []args){
        Lingkaran L = new Lingkaran();
        System.out.println("Luas Lingkaran ="+L.dapatLuas());
        System.out.println("Luas Lingkaran ="+L.dapatKeliling());
        PersegiPanjang p = new PersegiPanjang();
        System.out.println("Luas Lingkaran ="+p.dapatLuas());
    }
}
