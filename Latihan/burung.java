
public class burung {
    String bird  ="Saya Burung";
    public void fly(){
        System.out.println("saya bisa terbang");
    }
    public void Berkicau(){
        System.out.println("Saya Berkicau");
    }
    public void Berbicara(){
        System.out.println("Saya Bisa berbicara");
    }
}
class Beo extends burung{
    public Beo(){
        super.fly();
        System.out.println("Saya Beo bisa terbang");
    }
    public void Berbicara(){
        System.out.println("Beo bisa berbicara");
    } 
    public void Berkicau(){
        System.out.println("Beo bisa berkicau");
    } 
}
class Murai extends burung{
    public Murai(){
        super.fly();
        System.out.println("Murai bisa terbang");
    }
    public void Berkicau(){
        System.out.println("Murai bisa berkicau");
    } 
}

