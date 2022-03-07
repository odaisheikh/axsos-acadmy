import java.util.ArrayList;

public class TestOrder{

    public static void main(String[] args){

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip";
        item4.name = "capuccino";
        item1.price = 30;
        item2.price = 301;
        item3.price = 300;
        item4.price = 50;
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        order1.name = "Cindhuri";
        order2.name = "Noah";
        order3.name = "Jimmy";
        order4.name = "Sam";
        System.out.println(order1.name);
        order1.items.add(item1);
        order1.total++;
        order3.items.add(item4);
        order3.total++;
        order1.ready =true;
        order4.items.add(item2);
        order4.total+=2;
        order3.ready=true;

    }
}