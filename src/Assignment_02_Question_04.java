/*
A point in the x-y plane is represented by its x-coordinate and y-coordinate. Design a class,
PointType in Java, that can store and process a point in the x-y plane. You should then
 perform operations on the point, such as showing the point, setting the coordinates of the
 point, printing the coordinates of the point, returning the x-coordinate, and returning the y-
 coordinate. Every circle has a center and a radius. Given the radius, we can determine the
 circle’s area and circumference. Given the center, we can determine its position in the x-y
 plane. The center of a circle is a point in the x-y plane. Design a class, CircleType that can
 store the radius and center of the circle. Because the center is a point in the x-y plane &
 you designed the class to capture the properties of a point from PointType class. You must
 derive the class CircleType from the class PointType. You should be able to perform the
 usual operations on a circle, such as setting the radius, printing the radius, calculating and
 printing the area and circumference, and carrying out the usual operations on the centre.
 */
//import java.util.Scanner ;

class PointType {
    int x,y ;

    PointType(){
        this.x = 0 ;
        this.y = 0 ;
    }

    PointType(int x ,int y){
        this.x = x ;
        this.y = y ;
    }

    public void set_point(int a , int b){
        this.x = a ;
        this.y = b ;
    }

    public int x_coordinate(){
        return x ;
    }

    public int y_coordinate(){
        return y ;
    }

    public void get_point(){
        System.out.println("("+x+","+y+")");
    }

}

class circle_type extends PointType{
    public double distance (PointType r){
        int x1 = 0 ;
        int y1 = 0 ;
        int x2 = r.x_coordinate();
        int y2 = r.y_coordinate();
        return Math.pow((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1) , 0.5) ;
    }
    public double distance ( PointType s , PointType r){
        int x1 = s.x_coordinate() ;
        int y1 = s.y_coordinate() ;

        int x2 = r.x_coordinate();
        int y2 = r.y_coordinate();
        return Math.pow((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1) , 0.5);
    }

    double radius ;
    double area ;
    double circumference ;

    public void setRadius(PointType x ,PointType y){
        radius  = distance(x , y);
    }
    public void setRadius(PointType x ){
        radius  = distance(x );
    }
    public void getRadius(){
        System.out.println("the radius of the circle is ; "+radius);
    }
    public void getArea(){
        area = Math.PI * radius * radius ;
        System.out.println("the area of the circle is  ; " + area);
    }
    public void getCircumference(){
        circumference = 2 *  Math.PI * radius ;
        System.out.println("the circumference of the circle is ; " + circumference);
    }
}

public class Assignment_02_Question_04 {
    public static void main(String[] args){
        circle_type c = new circle_type() ;
        PointType p = new PointType();

        p.set_point(5,4);

        c.setRadius(p);
        c.getRadius();
        c.getArea();
        c.getCircumference();
    }
}
