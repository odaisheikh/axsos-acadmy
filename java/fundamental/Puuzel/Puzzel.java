import java.util.Random;

public class Puzzel{

    public int[] getTenRolls(){
        Random x = new Random();
        int y []=new int[10];
        for(int i=0;i<10;i++){
            y[i]=x.nextInt(11);
        }
        return y;
    }
    public String getRandomLetter(){
        char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String x = arr[]
        return "";

    }
    public static void main(String[] args){

    }
}