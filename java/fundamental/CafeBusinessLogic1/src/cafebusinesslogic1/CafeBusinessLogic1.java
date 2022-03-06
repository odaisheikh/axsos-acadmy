/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafebusinesslogic1;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collections;

/**
 *
 * @author user
 */
public class CafeBusinessLogic1 {

    public static int add(int x , int y){
        
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println("kjkkj");
        System.out.println(add(5,6));
        ArrayList x = new ArrayList();
        x.add(0, 5);
        System.out.println( x.clone());
        
        System.out.println(x);
        ArrayList <Integer> myArray = new ArrayList<Integer>();
        myArray.add(4);
        myArray.add(5);
        myArray.add(5);
        myArray.add(6);
        myArray.add(1);
        Collections.sort(myArray);
        System.out.println();
        int arr [] = new int[10];
        for(int i =0 ; i<5 ; i++){
            arr[i] = i;
        }
        System.out.println(arr.length);
        arr[9] = 11;
        ArrayList<Integer> appArrayList = new ArrayList<>();
        appArrayList.add(4);
        appArrayList.add(4);
        appArrayList.add(4);
        
        myArray.addAll(appArrayList);
        System.out.println(myArray);
    }
    
}
