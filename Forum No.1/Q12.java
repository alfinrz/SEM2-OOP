public class Q12 {
    public static void main(String[]args){
        System.out.println("Number|Square|Cube");
        //to make it easier we create a loop where it would simply calculate incrementally on it's own and using \t to create space between the number
        for (int i = 0; i<11; i++){
            System.out.println(i + "\t"  + (int)Math.pow(i,2) + "\t" + (int)Math.pow(i,3)); 
            //earlier I said the default for math is double but you can define the data type for *Math
        }
    }
}