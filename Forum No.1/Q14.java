import java.util.Scanner;
public class Q14 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Input number of seconds: ");
        int secint = reader.nextInt();

        int hour = secint/3600; 
        int minute = (secint%3600)/60; //the leftover seconds will be divided by 60 to turn into minutes
        int second = (secint%3600)%60; //the leftover seconds will be divided by 60 but we are taking the left over for this part

        System.out.println(hour + " hour " + minute + " minute "+ second + " second is the time that is left");
        
        reader.close();
    }
}
