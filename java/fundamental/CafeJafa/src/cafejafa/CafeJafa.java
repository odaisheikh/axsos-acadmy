/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafejafa;

/**
 *
 * @author user
 */
public class CafeJafa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String greetGeneral =  "Welcome to Cafe Java, " ;
        String  PendingMessage  =  ", your order will be ready shortly" ;
        String  MessagingReady  =  ", your order is ready" ; 
        String  MensajeMostrarTotal  =  "Your total is $" ; 
        double  MochaPrice  =3.0;
        double  coffee, latte, cappuccino  =3.0;
        String client1 ="Cindhuri";
        String client2 ="Sam";
        String client3 ="Jimmy";
        String client4 ="Noah";
        boolean orderClient1 = true; 
        boolean orderClient2 = false; 
        boolean orderClient3 = true;
        boolean orderClient4 = false; 
        boolean isOrderReady1 =  false ;
        System .out.println( greetGeneral  + client1); 
        if (orderClient3){
            System.out.println(PendingMessage);
            System.out.println(MessagingReady);
        }
        
    }
    
}
