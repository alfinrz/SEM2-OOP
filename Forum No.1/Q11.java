public class Q11 {
    public static void main(String[]args){

        byte x = 10; //using byte since we are working with really small numbers
        System.out.println("x value is "+ x); //the variable that is attach to this string is taken from the above variable assignment
        byte y = 5;
        System.out.println("y value is "+ y);
        
        byte z = y; //creating a third varible to act as one of the variable in order for it to not loop itself.
 
        System.out.println("exchanging");

        y = x; //swapping the value that is assign to each variable
        x = z;
        //the reason why this variable does not conflict with the one above is because the variable before this has overidden the previous variable
        System.out.println("x value is now "+ x); 
        System.out.println("y value is now "+ y);
    };
}