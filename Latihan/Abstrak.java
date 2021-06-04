

abstract class Shape{
    String color;
    public double getArea(){
        return getArea();
    }
}
class Triangle extends Shape{
    
    double base, height;

    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
class circle extends Shape{
    double radius;
    public circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}

public class Abstrak {
    public static void main(String []args){
        Triangle T = new Triangle(5, 7);
        System.out.println(T.getArea());

        circle c = new circle(10);
        System.out.println(c.getArea());
    }
}
