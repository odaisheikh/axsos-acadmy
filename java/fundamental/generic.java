import java.util.ArrayList;

public class generic {
    public static Object printArray( ArrayList<Object> inputArray ) {
        
        System.out.println(inputArray.get(0));
        return inputArray;
    }
    public static void main(String[] args){
        Integer [] x = {1,2,3,4};
        ArrayList<Object> x1 = new ArrayList<Object>();
        x1.add(4);
        printArray(x1);
    }
}
