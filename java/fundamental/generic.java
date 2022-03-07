import java.util.ArrayList;

public class generic {
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
           System.out.printf("%s ", element);
        }
        System.out.println();
     }
  
    public static void main(String[] args){
        Integer [] x = {1,2,3,4};
        ArrayList<Integer> x1 = new ArrayList<Integer>();
        x1.add(4);
        printArray(x);
    }
}
