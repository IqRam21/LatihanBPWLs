

public class Account {
    int a, b;

    public Account() {
        this.a = 0;
        this.b = 0;
    }

    public Account(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setNewData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void showData() {
        System.out.println("Nilai Attribut a: " + this.a);
        System.out.println("Nilai Attribut b: " + this.b);
    }
}
