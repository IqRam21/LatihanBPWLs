
public class Mobil1 {
    void suaraMobil(){
        System.out.println("brr brr brr ");
    }
    void banMobil(){
        System.out.println("Beroda empat");
    }
    void besarMobil(){
        System.out.println("Ukuran Sedang");
    }
}

class MobilTruk extends Mobil1{
    @Override
    void suaraMobil(){
        System.out.println("breng breng breng ");
    }
    void banMobil(){
        System.out.println("Beroda enam");
    }
}

class testmobil1 {
        public static void main(String []args){
            MobilTruk Mt = new MobilTruk();
    
            Mt.suaraMobil();
            Mt.banMobil();
        }
    }
