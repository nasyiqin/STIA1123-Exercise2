public class SquareCube {

    public static void main(String[] args) {

        System.out.printf("%-8s%9s%9s\n", "Number", "Square", "Cube"); //display number,square,cube

        int num = 11; //declare num as 11

        for (int i = 0; i < num; i++) { //loop 1 until 10
            System.out.println(i + "\t\t\t" + (int)Math.pow(i, 2) + "\t\t\t" + (int)Math.pow(i, 3)); //output with calculation 
        }
    }
}
