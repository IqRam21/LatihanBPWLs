package Pratikum_PBO_3;

public class TestTitik {
    public static void main(String[] args) {
        Titik objtik1 = new Titik();
        Titik objtik2 = new Titik();

        System.out.println("Keadaan Awal : ");
        objtik1.setTitik1();
        objtik1.setTitik2();

        System.out.println("Keadaan Setelah Bergeser : ");
        System.out.println("Titik 1 : ");
        objtik2.geserKanan(2);
        objtik2.geserBawah(3);
        System.out.println("Titik 2 : ");
        objtik1.geserKanan(0);
        objtik1.geserAtas(1);

    }
}
