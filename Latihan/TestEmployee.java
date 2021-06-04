

public class TestEmployee {
    public static void main(String[] args) {
        int n = 5;
        int i;
        Employee emp[] = new Employee[n];

        for (i = 0; i < n; i++) {
            emp[i] = new Employee();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Masukkan Detail Data Karyawan " + (i + 1) + " :");
            emp[i].getData();
            System.out.println();
        }
        System.out.println("Detail Karyawan yang telah diinputkan : ");
        System.out.println("Id\tNama\tUmur\tgaji");
        for (i = 0; i < n; i++) {
            emp[i].putData();
        }
    }
}
