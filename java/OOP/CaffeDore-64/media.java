import java.util.ArrayList;
import java.util.Collections;

public class media {
    public static double mid(int x[],int y[]){
        ArrayList<Integer> demo = new ArrayList<Integer>();
        double sum = 0;
        double sum1 = 0;
        for(int i =0 ;i<x.length;i++){
            demo.add(x[i]);
            sum+=x[i];
        }
        for(int i =0 ;i<y.length;i++){
            demo.add(y[i]);
            sum1+=y[i];
        }
        Collections.sort(demo); 
        if (demo.size()%2==0){
            double sum2 = demo.get((demo.size()/2)-1)+demo.get((demo.size()/2));
            return sum2/2;
            
        }
        else {
            return demo.get(((demo.size()+1)/2));
        }
    } 
    public static void main (String[] args){
        int x [] = {1,5,9};
        int z [] = {1,2,3,4,5};
        double c = mid(x,z);
        System.out.println(c);
    }
}
