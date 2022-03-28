import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter amount of variable:");

        //Used byte to practice my memory usage
        byte ItemNum = reader.nextByte();

        //Error Checking
        while (ItemNum < 0){
            System.out.println("number must be above 0, please re-enter:");

            ItemNum = reader.nextByte();
        }
        
        //Initializing the array
        byte [] item = new byte[ItemNum];

        System.out.println("please enter item value (With space inbetween):");
        
        //A for loop in order to accept multiple array value
        for (byte i = 0; i < item.length; i++){
            item[i] = reader.nextByte();

        }
        //Originally I was confused why Arrays. wasn't working, turns out I forgot to have the command I needed java.util.Arrays
        System.out.println("Entered Values are:" + Arrays.toString(item));
            

        reader.close();
    }
}