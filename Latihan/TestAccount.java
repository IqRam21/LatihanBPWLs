package Pratikum_PBO_3;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account(10, 105);
        Account acc4 = new Account();
        Account acc5 = new Account(107, 118);

        acc1.setNewData(100, 110);
        acc2.setNewData(110, 120);
        acc4.setNewData(100, 110);

        System.out.println("Nilai Atribut pada Object 1 :");
        acc1.showData();
        System.out.println("Nilai Atribut pada Object 2 :");
        acc2.showData();
        System.out.println("Nilai Atribut pada Object 3 :");
        acc3.showData();
        System.out.println("Nilai Atribut pada Object 4 :");
        acc4.showData();
        System.out.println("Nilai Atribut pada Object 5 :");
        acc5.showData();
    }
}
