package lab3;

/**Savings also extends Account, but uses a different 3 interfaces.  I thought
 * the interface worked great for this.  You can implement which "functions"
 * each account type has, but also change the methods to suit the account 
 * type.  i.e. interest might need to be calculated differently for a savings
 * account and a credit card account.
 *
 * @author chrisgeiser
 */
public class Savings extends Account
    implements WithdrawCash, DepositFunds, CalculateInterest {
    
    private double withdrawAmount, depositAmount, interestAmount, interestRate;
    
    // constructor
    public Savings(String name, String num, double balance) {
        this.setAccountName(name);
        this.setAccountNumber(num);
        this.setAccountBalance(balance);
    }
    
    // from Interface WithdrawCash
    public void withdrawCash(double amount) {
        withdrawAmount = amount;
        this.setAccountBalance(this.getAccountBalance() - withdrawAmount);
    }
    
    public double getWithdrawAmount() {
        return withdrawAmount;
    }
    
    // from Interface DepositFunds
    public void depositFunds(double amount){
        depositAmount = amount;
        this.setAccountBalance(this.getAccountBalance() + depositAmount);
    }
    
    public double getDepositAmount(){
        return depositAmount;
    }
    
    // from CalculateInterest
    public void applyInterest() {
        interestAmount = this.getAccountBalance() * interestRate;
        interestAmount *= 100;
        double rounded = Math.round(interestAmount);
        interestAmount = rounded / 100;
        this.setAccountBalance(this.getAccountBalance() + interestAmount);
    }
    public void setInterestRate(double rate) {
        if (rate <= 0) {
            System.out.println("Invalid interest entry.");
            System.exit(0);
        }
        interestRate = rate;
    }
    public double getInterestRate() {
        return interestRate;
    }
}
