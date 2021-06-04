
package Pratikum_PBO_3;

import java.util.*;

public class TestPenumpangPesawat {
    public static void main(String[] args) {
        int n, i;
        String nama, jk, tujuan, kelas;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Penumpang yang diinputkan : ");
        n = input.nextInt();

        PenumpangPesawat penumpang[] = new PenumpangPesawat[n];
        for (i = 0; i < n; i++) {
            penumpang[i] = new PenumpangPesawat();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Masukkan data Penumpang ke - " + (i + 1));
            System.out.println("Masukkan nama Penumpang");
            input.nextLine();
            nama = input.nextLine();
            System.out.println("Masukkan Jenis Kelamin Penumpang");
            jk = input.nextLine();
            System.out.println("Masukkan Tujuan Penumpang");
            tujuan = input.nextLine();
            System.out.println("Masukkan Kelas Penumpang");
            kelas = input.nextLine();

            System.out.println();

            penumpang[i].setNama(nama);
            penumpang[i].setJk(jk);
            penumpang[i].setTujuan(tujuan);
            penumpang[i].setKelas(kelas);
        }
        System.out.println("Detail Penumpang yang telah Diinputkan");
        System.out.println("Nama\tJenis Kelamin\tTujuan\tKelas");
        for (i = 0; i < n; i++) {
            System.out.println(penumpang[i].getNama() + "\t" + penumpang[i].getjk() + "\t\t" + penumpang[i].getTujuan()
                    + "\t" + penumpang[i].getKelas() + "\t");
        }
    }
}
