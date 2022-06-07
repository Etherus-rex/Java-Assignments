/*
Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
 java program to display area of different shapes.

 */
import java.util.Scanner ;

abstract class shape{
    public double getDimension(){
        int dimension1 ;
        Scanner in = new Scanner(System.in);
        dimension1 = in.nextInt() ;
        return dimension1;
    }
    abstract void area() ;
}
class square extends shape {
    public void area(){
        System.out.print("Enter the value of the side of the square ; ");
        double side = getDimension();
        double area = side*side ;
        System.out.println("the area of the square ; " + area );
    }
}

class rectangle extends shape{

    public void area(){
        System.out.print("Enter the length of the rectangle ; ");
        double length = getDimension();

        System.out.print("Enter the width of the rectangle ; ");
        double width = getDimension() ;

        System.out.print("the area of the rectangle is ; ");
        double area = length * width ;

        System.out.println(area);
    }
}

class triangle extends shape {
    public void area (){
        System.out.print("Enter the height of the triangle ; ");
        double height = getDimension();

        System.out.print("Enter the base length of the triangle ; ");
        double base = getDimension();

        double area = 0.5*base*height ;
        System.out.println("the area of the triangle is ; " +area) ;
    }
}

class circle extends shape {
    public void area (){
        System.out.print("Enter the radius of the circle ; ");
        double r = getDimension() ;

        double area = Math.PI * r * r ;
        System.out.println("The area of the circle is ; "+area );
    }
}

public class Assignment_02_Question_06 {
    public static void main(String[] args) {
        square s1 = new square() ;
        s1.area();

        rectangle r1 = new rectangle() ;
        r1.area();

        triangle t1 = new triangle() ;
        t1.area();

        circle c1 = new circle() ;
        c1.area();

    }
}
