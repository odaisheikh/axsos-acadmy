import java.util.ArrayList;
public class Order {
    private String name;
    Item x = new Item();
    // private double total;
    private boolean ready ;
    private ArrayList<Item> items  ;

public Order(){
    this.name = "Geust";
    items = new ArrayList<Item>();
}
public Order(String name){
    this.name = name;
    // this.ready = ready;
    // this.total = total;
    // this.items = items;
}
public void setName(String name){
    this.name = name;
}
public void setItems(Item item){
    this.items.add(item);
}
// public void Price(double price){
//     this.total = price;
// }
public void setReady(boolean ready){
    this.ready = ready;
}
public boolean isReady(){
    return this.ready;
}
public String getName(String name){
    return this.name;
}
// public double getTotal(double total){
//     return this.total;
// }
public ArrayList<Item> getItem(){
    return this.items;
}
public String getStatusMessage(){
    if (ready){
        return "your order is ready";
    }
    else{ 
    return "yore order will be ready soon";}
}
public void display(){
    double total = 0;
    System.out.println(this.name);
    for(Item x : items){
        total += x.getPrice();
        System.out.println(x.getName() + "price :"+ x.getPrice());
    }
    System.out.println(total);
}
}
