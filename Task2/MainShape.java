public class MainShape {

    public static void main(String[] args) {
        
        Shape circle=new Circle(10);
        Shape rectangle=new Rectangle(10, 15);
        Shape triangle=new Triangle(5, 20);


        System.out.println("Area of Circle:- "+circle.calculateArea());
        System.out.println("Area of rectangle:- "+rectangle.calculateArea());
        System.out.println("Area of triangle:- "+triangle.calculateArea());
    }
    
}
