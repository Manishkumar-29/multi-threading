import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * this is next method that is used to take input and it take input upto first space in the given input
        * */

//        String inputString  = sc.next();
//        System.out.println(inputString);

        /*
        * this methos is also same as next method but it take all the input along with spaces in string
        * */

        String fullString = sc.nextLine();
        System.out.println(fullString);
    }
}
