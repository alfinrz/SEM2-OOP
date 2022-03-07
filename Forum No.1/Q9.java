import java.util.Scanner; //using a new module for me, since java doesn't natively support inputs (or I just didn't find another way)
public class Q9 {
    public static void main(String[]args){
    Scanner reader = new Scanner(System.in); 
    
    System.out.println("Enter temprature in Celcius:"); //using println so the next string starts below this one

    float inputc = reader.nextFloat(); //the line of code for accepting input, and using float since the number after the decimal won't be too big
        
    float convert = ((inputc*1.8f)+32); //The formula for Fahrenheit to Celcius conversion
        
    System.out.println("Celcius Temperature is: "+ inputc + " If converted to Fahrenheit it is: "+ convert);
    
    reader.close(); //this line is to stop the code from accepting input, because if not then a potential memory leak might happen
    }


}



