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
    
}
