package Pratikum_PBO_3;

public class Bilangan {
    int x;
    int bil;

    void ganjil(int x) {
        this.x = x;
        if (this.x % 2 != 0 && x % 2 != 0) {
            System.out.println("Angka x =" + this.x);
            System.out.println("TRUE");
        } else {
            System.out.println("Angka x =" + this.x);
            System.out.println("FALSE");
        }
    }

    void lebihkecil(int x, int bil) {
        this.x = x;
        this.bil = bil;
        if (this.x > this.bil && x == bil) {
            System.out.println("Angka x =" + this.x + " dan Angka bil =" + this.bil);
            System.out.println("TRUE");
        } else {
            System.out.println("Angka x =" + this.x + " dan Angka bil =" + this.bil);
            System.out.println("FALSE");
        }
    }

    void lebihbesar(int x, int bil) {
        this.x = x;
        this.bil = bil;
        if (this.x < this.bil && x == bil) {
            System.out.println("Angka x =" + this.x + " dan Angka bil =" + this.bil);
            System.out.println("TRUE");
        } else {
            System.out.println("Angka x =" + this.x + " dan Angka bil =" + this.bil);
            System.out.println("FALSE");
        }
    }

    void samabesar(int x, int bil) {
        this.x = x;
        this.bil = bil;
        if (this.x == this.bil && x == bil) {
            System.out.println("Angka x =" + this.x + " dan Angka bil =" + this.bil);
            System.out.println("TRUE");
        } else {
            System.out.println("Angka x =" + this.x + " dan Angka bil =" + this.bil);
            System.out.println("FALSE");
        }
    }
}
