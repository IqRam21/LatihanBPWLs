package Pratikum_PBO_3;

public class Segitiga {
    private int alas, tinggi, sisi;

    public int getSegitiga1() {
        int ls;
        return ls = alas * tinggi / 2;
    }

    public void setSegitiga2(int alas, int tinggi, int sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
        System.out.println("Luas Segitiga = " + (alas * tinggi / 2));
    }

    public int getSegitiga3() {
        int kel;
        return kel = alas + tinggi + sisi;
    }

    public void setSegitiga4(int alas, int tinggi, int sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
        System.out.println("Keliling Segitiga = " + (alas + tinggi + sisi));
    }
}