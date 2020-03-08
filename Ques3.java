import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args)
    {
        String str, reverse = ""; //declare input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string to reverse: "); //user enter input
        str = in.nextLine(); //program read input

        int length = str.length();

        for ( int i = length - 1 ; i >= 0 ; i-- ) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse of entered string is: "+reverse); //display input in reverse
    }
}