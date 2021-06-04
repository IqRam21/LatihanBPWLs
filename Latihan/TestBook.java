package Pratikum_PBO_3;

public class TestBook {
    public static void main(String [] args){
        book b1 = new book();

        b1.setTitle("Harry Potter and the Goblet of Fire");
        b1.setAuthor("JK Rouling");

        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        
        b1.tampilInfo();
    }
}
