

import java.util.Scanner;

public class Employee {
    private int id, age;
    private String name;
    private double salary;

    public Employee() {
        id = age = 0;
        name = "";
        salary = 0;
    }

    public void getData() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Id Karyawan : ");
        id = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan Nama Karyawan :");
        name = input.nextLine();

        System.out.println("Masukkan Umur Karyawan :");
        age = input.nextInt();

        System.out.println("Masukkan Gaji Karyawan :");
        salary = input.nextDouble();

    }

    public void putData() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + salary + "\t");
    }
}
