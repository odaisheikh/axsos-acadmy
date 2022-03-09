import java.util.ArrayList;

public class NewOrder {
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public NewOrder(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }
    
    public void addMenu(String name, double price){
        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        this.menu.add(item);
    }
    public void display(){
        int counter = 0;
        for(Item x : menu){
            System.out.println(counter + x.getName() + "price :"+ x.getPrice());
            counter++;
        }
    }
    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order x = new Order();
        x.setName(name);
        display();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        while(!itemNumber.equals("q")) {
            x.setItems(menu.get(Integer.parseInt(itemNumber)));
            itemNumber = System.console().readLine();
        }
        this.orders.add(x);
        x.display();
        
    }
    
}
