import java.util.*;
class CafeUtile {
    public int getStreakGoal(int num){
        int sum = 0;
        for(int i =0;i<num;i++){
            sum +=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum =0;
        for(int i=0;i<prices.length;i++){
            sum +=prices[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size();i++){
            System.out.println(i +":"+ menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> arr){
        System.out.println("please enter yore name");
        String userName = System.console( ).readLine ();
        arr.add(userName);
        for(int i=0;i<arr.size();i++){
            System.out.println(i +":"+arr.get(i));
        }
    }


}