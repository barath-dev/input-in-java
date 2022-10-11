import java.util.Scanner;  //imports 

public class main {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in); //creates a new scanner object
        int x = in.nextInt();
        in.close(); //it is advised to close the scanner after getting the input
        System.out.println(x);
    }

}
