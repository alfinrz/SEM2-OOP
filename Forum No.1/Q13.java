import java.util.Scanner;
public class Q13 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Your equation: ax^2 + bx + c = 0");
        //without this the value is stuck in the while loop
        byte vala = 0;
        //using a while loop in order to deny 0 as a accepted input
        while(true){
            System.out.println("a: ");
            vala = reader.nextByte();
            if(vala == 0){
                System.out.println("number can't be 0");
            }
            else{
                break ;
            }

        };
        
        System.out.println("b: ");
        byte valb = reader.nextByte();
        
        System.out.println("c: ");
        byte valc = reader.nextByte();

        double x = -valb + Math.sqrt(Math.pow(valb,2)-4*vala*valc);
        
        System.out.println(x);
        reader.close();
        //while this code work, there might be an issue with *vala since everytime I try to run it, it always return with NaN
    }
}