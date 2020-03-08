import java.util.Random; //class Random number
import java.util.Scanner; // class Scanner input

public class RandomInRange {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        Random rand = new Random();

        System.out.print("Enter a minimum number: "); //user enter random smallest number
        int min = input.nextInt(); //program read the input

        System.out.print("Enter a minimum number: "); //user enter random biggest numbr
        int max = input.nextInt(); //program read the input

        int randomNum = rand.nextInt((max - min) + 1) + min;

        System.out.println("Random num: " + randomNum); //display random number from range
    }
}
