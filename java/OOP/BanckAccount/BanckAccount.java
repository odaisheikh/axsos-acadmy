public class BanckAccount {
    private double checkingPalance;
    private double savingBalance;
    private static int numberOfAccount;
    private static double totalAmountOfMony;

public BanckAccount(){
    numberOfAccount++;
    checkingPalance = 0;
    savingBalance = 0;
}

public double getGhecking(){
    return this.checkingPalance;
}

public double getSaving(){
    return this.savingBalance;
}

public void setSaving(double amount){
    this.savingBalance +=amount;
    totalAmountOfMony +=amount;
}
public void setGhecking(double amount){
    this.checkingPalance +=amount;
    totalAmountOfMony +=amount;
}

public double withDraw(double amount){
    double x = amount;
    if(amount<=this.checkingPalance){
        this.checkingPalance -=100;
        totalAmountOfMony -=100;
        return amount;
    }
    else{
        return 0.0;
    }
}
public void display(){
    System.out.println("the total amount from saving ang checking balance : "+(this.savingBalance+this.checkingPalance));
}
public static void main(String[] args){
    BanckAccount odai = new BanckAccount();
    BanckAccount ali = new BanckAccount();
    ali.setSaving(1000);
    odai.setGhecking(1000);
    odai.withDraw(100);
    System.out.println(odai.getSaving());
    System.out.println(odai.getGhecking());
    System.out.println(odai.withDraw(100));
    odai.display();
    System.out.println( BanckAccount.numberOfAccount);
    System.out.println( BanckAccount.totalAmountOfMony);

}
}
