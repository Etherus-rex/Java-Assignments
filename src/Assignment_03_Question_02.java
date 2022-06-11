/*
Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java.
 */
import java.util.Objects;
import java.util.Scanner ;

class invalidColorException extends Exception {
    invalidColorException(int i ){
        System.out.println("Error at index ; "+ i);
        System.out.println(" :: Invalid color detected :: ");
    }
}

public class Assignment_03_Question_02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of colors u want to add ");
        int n = in.nextInt();

        String[] Color = new String[n];

        for(int i = 0 ; i<n ; i++){
            Color[i] = in.next();
        }
        for(int i=0; i<n ; i++){
            try{
                if (Objects.equals(Color[i], "white")){
                    throw new invalidColorException(i);
                }
                else {
                    System.out.println(Color[i]);
                }
            }
            catch (invalidColorException e ){
                System.out.println("You Entered White ; at index "+i);
            }
        }
    }
}
