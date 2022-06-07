/*
Define an interface to declare methods display ( ) & count ( ). Another class contains a static
 data member maxCount, instance member name & method display ( ) to display name of a
 person, count the no. of characters present in the name of the person.
 */

interface base {
    void display() ;
    void count()  ;
}
class newPerson implements base {
    static int maxCount ;
    String name ;

    public void setName(String name ){
        this.name = name ;
    }

    public void display (){
        System.out.println("The name of the person ; " + name );
    }
    public void count(){
        int maxCount = name.length();
        System.out.println("The max count of the persons name is  ; " +maxCount);
    }
}

public class Assignment_02_Question_07 {
    public static void main(String[] args){
        newPerson p =new newPerson() ;

        p.setName("Rohit Mishra");
        p.display();
        p.count();
    }
}

