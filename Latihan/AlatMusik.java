interface AlatMusik {
    void tipeAlatMusik();
    void memainkan();
    void setelNada();
    void ambilNama();
}
class MusikPetik implements AlatMusik{
    String namaAlat ="gitar,Bass,ukulele";
    public void tipeAlatMusik(){
        System.out.println("ini alat Musik Class Petik");
    }
    public void memainkan(){
        System.out.println("Dimainkan dengan cara dipetik");
    }
    public void setelNada(){
        System.out.println("menyetel dengan cara mengatur senar/tali");
    }
    public void ambilNama(){
        System.out.println("Contoh alat musik diPetik adalah : " +namaAlat);
    }
}
class Musiktiup implements AlatMusik{
    String namaAlat ="Fluet, Suling, Recorder";
    public void tipeAlatMusik(){
        System.out.println("ini alat Class Musik Tiup");
    }
    public void memainkan(){
        System.out.println("Dimainkan dengan cara ditiup");
    }
    public void setelNada(){
        System.out.println("dengan mengatur angin yang akan keluar pada lubang dan ditiup");
    }
    public void ambilNama(){
        System.out.println("Contoh alat musik ditiup adalah : " +namaAlat);
    }
}
class Musikpukul implements AlatMusik{
    String namaAlat ="Drum, Pentongan, Beduk";
    public void tipeAlatMusik(){
        System.out.println("ini alat Class Musik Pukul");
    }
    public void memainkan(){
        System.out.println("Dimainkan dengan cara dipukul");
    }
    public void setelNada(){
        System.out.println("dengan memukulkan tongkat/telapak tangan kepada alat musik");
    }
    public void ambilNama(){
        System.out.println("Contoh alat musik dipukul adalah : " +namaAlat);
    }
}
class TestAlatMusik{
    public static void main(String[]args){
        MusikPetik Mp = new MusikPetik();
        Mp.tipeAlatMusik();
        Mp.memainkan();
        Mp.setelNada();
        Mp.ambilNama();
        System.out.println();

        Musiktiup Mt  = new Musiktiup();
        Mt.tipeAlatMusik();
        Mt.memainkan();
        Mt.setelNada();
        Mt.ambilNama();
        System.out.println();

        Musikpukul Mpu  = new Musikpukul();
        Mpu.tipeAlatMusik();
        Mpu.memainkan();
        Mpu.setelNada();
        Mpu.ambilNama();
        System.out.println();
    }
}