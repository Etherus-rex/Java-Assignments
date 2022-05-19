/*
Create a class Point with instance variables x, y to represent co-ordinates of point and instance
method setPoint(). Write a Java program to fnd distance between two points using a method
fndDistance(Point,Point).
 */
class Point{
    double x ;
    double y ;

    public void setPoint(double a ,double b){
        x = a;
        y = b;
    }
}

public class Assignment_01_Question_10 {
    public static void main(String[] args){

        Point coordinate1 = new Point();
        coordinate1.setPoint(5,0);

        Point coordinate2 = new Point();
        coordinate2.setPoint(3,0);

        findDistance(coordinate1 , coordinate2);
    }

    public static void findDistance(Point first , Point second){
        double distance ;
        distance = Math.sqrt(Math.pow(first.x-second.x, 2)+Math.pow(first.y-second.y, 2));
        System.out.println("the distance between the points "+first+" and "+second+" is "+distance);
    }
}
