import java.util.ArrayList;
import java.time.LocalDate;

public class TestCafe {
    public static void main(String[]  args){
        CafeUtile xc = new CafeUtile();
        System.out.println(xc.getStreakGoal(10));
        System.out.println("display menue----------------");
        ArrayList<String> menue = new ArrayList<String>();
        menue.add("cafe");
        menue.add("tea");
        menue.add("capat");
        menue.add("nesc");
        xc.displayMenu(menue);
        System.out.println("display customer----------------");
        ArrayList<String> customer = new ArrayList<String>();
        customer.add("ali");
        customer.add("khaled");
        customer.add("ahmad");
        customer.add("mahmoud");
        xc.addCustomer(customer);
    }
}