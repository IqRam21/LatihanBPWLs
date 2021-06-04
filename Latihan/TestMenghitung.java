package Pratikum_PBO_3;
import Another_Pratikum_PBO_3.Menghitung;

public class TestMenghitung {
    public static void main(String []args){
        Menghitung objhitung = new Menghitung();
        
        int nomor1 = objhitung.nomor1 = 7;
        int nomor2 = objhitung.nomor2 = 22;

        double nmr1 = objhitung.nmr1 = 12.6;
        double nmr2 = objhitung.nmr2 = 4.6;
        
        System.out.println("Penjumalahan "+nomor1+" + "+nomor2+" = "+objhitung.jumlah());
        System.out.println("Pengurangan "+nmr1+" - "+nmr2+" = "+objhitung.kurang());
    }
}
