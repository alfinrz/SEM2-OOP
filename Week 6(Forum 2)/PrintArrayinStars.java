import java.util.Scanner;
import java.util.Arrays;

public class PrintArrayinStars {
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
        
        System.out.println("Entered Values are:" + Arrays.toString(item));
            
        for (byte i = 0; i < item.length; i++){
            System.out.println(i + ":" + "*".repeat(item[i])+ "(" + item[i]+")");
        }
        
        /*This was the original idea for printing the stars using dual For Loop, 
        but just couldn't get it to work and after looking at old python code I rememered about I went with the solution above

        for (byte i = 0; i < item.length; i++){
            System.out.println(i + ":");
        
        }
            for (byte i = 0; i < item[i]; i++){
                System.out.print("*");
        */
            

        reader.close();
    }
}