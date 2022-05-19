/*
Write a Java class Flower that has three instance variables of type String, int, and float, which
respectively represent the name of the flower, its number of petals, and price. Your class must
include a method that initialises each variable to an appropriate value, and your class should include
methods for setting the value of each type, and getting the value of each type.
 */
class flower {
    String name ;
    int number_of_petals ;
    float price ;

    public void setDetail(String n,int np,float p){
        name = n;
        number_of_petals = np;
        price = p;
    }
    public void getDetails(){
        System.out.println("name = "+ name + " number of petals = " + number_of_petals + " price = " + price );

    }

}
public class Assignment_01_Question_11 {
    public static void main(String[] args){
        flower flower_stats = new flower();
        flower_stats.setDetail("Rose" , 10 , 15);
        flower_stats.getDetails();
    }
}
