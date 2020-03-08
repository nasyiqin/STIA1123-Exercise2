import java.util.Scanner;

public class CountA {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //scanner input

        System.out.print("Enter string: "); //user enter a string input

        String str = input.next(); //read input

        int count = str.length() - str.replaceAll("a","").length();

        System.out.println("Amount 'a': "+ count); //display amount of a

    }
}
