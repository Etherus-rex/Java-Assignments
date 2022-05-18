/*
Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r',
'b', 'o', and 'n' exactly once
 */



public class Assignment_01_Question_03 {
    public static void main(String[] args){



        String[] que = {"c","a","r","b","o","n"};

        int count = 0 ;

        for(String c : que){
            for(String a  : que){
                for(String r : que){
                    for(String b : que){
                        for(String o : que){
                            for (String n :que){
                                System.out.println(c+a+r+b+o+n);
                                count = count+1 ;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("the number of outcomes are "+count );
    }
}

