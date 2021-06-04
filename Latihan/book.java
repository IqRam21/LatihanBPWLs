package Pratikum_PBO_3;

public class book {
    private String title;
    private String author;

    public book (){
        title="";
        author="";
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void tampilInfo(){
        System.out.println("Judul Buku = "+getTitle());
        System.out.println("Penulis Buku = "+getAuthor());
    }
}
