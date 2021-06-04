package Pratikum_PBO_3;

public class AsosiasiBankPegawai {
    public static void main(String[] args) {
        Bank bank = new Bank("Mandiri");

        Pegawai pg1 = new Pegawai("Budi");
        Pegawai pg2 = new Pegawai("Wati");

        bank.setNamaPegawai(pg1.getName());
        bank.setNamaPegawai(pg2.getName());

        System.out.println("Jumlah Pegawai : " + bank.getJmlPegawai());
        System.out.println("Nama - Nama Pegawai :");
        for (int i = 0; i < bank.getJmlPegawai(); i++) {
            System.out.println((i + 1) + "." + bank.getNamaPegawai(i));
        }
    }
}
