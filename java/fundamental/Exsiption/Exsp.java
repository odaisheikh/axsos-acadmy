import java.util.ArrayList;

public class Exsp {
    public static void main(String[] args){
        ArrayList<Object> x = new ArrayList<Object>();
        x.add(5);
        x.add("ali");
        x.add(13);
        x.add('r');
        try {
            for(int i=0;i<x.size();i++){
                Integer castValue = (Integer)x.get(i);
            }
        } catch (Exception e) {
            System.out.println("your input shoud be integer value");
        }
    }
}
