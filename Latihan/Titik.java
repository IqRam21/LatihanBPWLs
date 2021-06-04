package Pratikum_PBO_3;

public class Titik {
    private int x;
    private int y;
    private int z;

    public void setTitik1() {
        System.out.println("Titik 1 :");
        this.x = 0;
        this.y = 0;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public void setTitik2() {
        this.x = x = 4;
        this.y = y = 3;
        System.out.println("Titik 2 :");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public void geserKanan(int z) {
        this.z = z;
        int kanan = x + (1 * z);
        System.out.println("x = " + kanan);
    }

    public void geserKiri(int z) {
        this.z = z;
        int kiri = x - 1;
        System.out.println("x = " + kiri);
    }

    public void geserAtas(int z) {
        this.z = z;
        int atas = y + 1;
        System.out.println("y = " + atas);
    }

    public void geserBawah(int z) {
        this.z = z;
        int bawah = y - 1;
        System.out.println("y = " + bawah * z);

    }

}
