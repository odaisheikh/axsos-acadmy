import java.util.ArrayList;

public class TestOrder{

    public static void main(String[] args){

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        // item1.setName("mocha"); 
        // item2.setName("latte");
        // item3.setName("drip"); 
        // item4.setName("capuccino"); 
        // item1.setPrice(30); 
        // item2.setPrice(300); 
        // item3.setPrice(330); 
        // item4.setPrice(310);
        // Order order1 = new Order();
        // order1.setItems(item1);
        // order1.setItems(item2);
        // order1.display();
        // order1.setReady(true);
        // // System.out.println(order1.getItem().getName());
        // ArrayList <Item> xc ;
        // xc = order1.getItem();
        // for(Item x : xc){
        //     System.out.println(x.getName());
        // }

        // System.out.println(order1.getStatusMessage()); 
        NewOrder kikos = new NewOrder();
            kikos.addMenu("cafe" ,12 );
            kikos.display();
    }
}
