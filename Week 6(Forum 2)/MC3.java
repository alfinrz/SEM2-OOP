import java.util.Scanner;

public class MC3 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter amount of Students:");

        int numStudent = reader.nextInt();

        while (numStudent < 0){
            System.out.println("number must be above 0, please re-enter:");

            numStudent = reader.nextInt();
        }
        
        int [] grade = new int[numStudent];

        for (int i = 0; i < grade.length; i++){
            System.out.print("Enter grade for student "+ (i+1) + ":");
            grade[i] = reader.nextInt();

        }

        int max = 0;
        int min = grade[0];
        double sum = 0;
        for (int i = 0; i < grade.length; i++){
            
    
            sum = sum + grade[i];
            //Creatiing a loop to determine which number is the biggest
            if (grade[i]>max){  //Had an issue where the code simply didn't work properly,
                max = grade[i]; //but turns out the issue was that I forgot in java {} are required in if statement,cause I was just looking at a friends python code
            }                   //cause I was just looking at a friends python code
            
            if (grade[i]<min){
                min = grade[i];
            }
             
        }

        double mean = sum / grade.length;
        System.out.println("The average score is:" + mean);
        System.out.println("The max score is:" + max);
        System.out.println("The min score is:" + min);
        
        reader.close();
    }
}