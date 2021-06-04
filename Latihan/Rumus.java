package Pratikum_PBO_3;

public class Rumus {
    int alas,tinggi;
   public void RLuasSegitiga(){
        System.out.println((0.5*alas*tinggi));
   }
   public void RluasSegitiga(int alas, int tinggi){
    System.out.println((0.5*alas*tinggi));
   }
}
class main{
    public static void main(String []args){
        Rumus r = new Rumus();
        r.alas =5;
        r.tinggi=5;
        r.RLuasSegitiga();
        System.out.println();
        r.RluasSegitiga(6,7);
    }
}

