package lab3;

/**Checking extends Account and implements 3 of the 5 interfaces.  I made the 
 * bank "functions" interfaces so that each type of account can have only 
 * the methods it needs.  
 *
 * @author chrisgeiser
 */
public class Checking extends Account 
    implements WriteCheck, DepositFunds, WithdrawCash {
    
    private double[] checkAmount = new double[10];
    private double depositAmount;
    private double withdrawAmount;
    
    // constructor
    public Checking (String name, String number, double balance) {
        this.setAccountName(name);
        this.setAccountNumber(number);
        this.setAccountBalance(balance);
    }
    
    // from Interface WriteCheck
    public void writeCheck(int number, double amount) {
        checkAmount[number] = amount;
        this.setAccountBalance(this.getAccountBalance() - amount);
    }
    
    public double getCheckAmount(int number) {
        return checkAmount[number];
    }
    
    // from Interface DepositFunds
    public void depositFunds(double amount){
        depositAmount = amount;
        this.setAccountBalance(this.getAccountBalance() + depositAmount);
    }
    
    public double getDepositAmount(){
        return depositAmount;
    }
    
    // from Interface WithdrawCash
    public void withdrawCash(double amount) {
        withdrawAmount = amount;
        this.setAccountBalance(this.getAccountBalance() - withdrawAmount);
    }
    
    public double getWithdrawAmount() {
        return withdrawAmount;
    }
}
