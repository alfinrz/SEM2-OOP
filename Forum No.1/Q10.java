//overall pretty similiar to the last one just differnt implementation of the data collected

import java.util.Scanner; 
public class Q10 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter Value x1:");
        float x1 = reader.nextFloat();
        
        System.out.println("Enter Value x2:");
        float x2 = reader.nextFloat();
        
        System.out.println("Enter Value x3:");
        float x3 = reader.nextFloat();

        float mean = ((x1+x2+x3)/3); //using float again to save on memory

        double variance = ((Math.pow(x1-mean,2)) + (Math.pow(x2-mean,2)) + (Math.pow(x3-mean,2)))/3; //using double here because the *Math module uses double as default

        double stdeviance = Math.sqrt(variance);

        System.out.println("The mean value is: " + String.format("%.2f", mean)); //interms of formatting it is similiar to python the difference is that you have to define that you are formatting that string using a different function
        System.out.println("The variance is: " + String.format("%.2f",variance));
        System.out.println("The standard deviance value is: " + String.format("%.2f",stdeviance));


        reader.close();
    }

}