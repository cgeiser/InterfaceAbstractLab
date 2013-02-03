package lab3;

/**Another concrete instantiatable class.  In this simple example, implementing
 * methods from only 2 interfaces.
 *
 * @author chrisgeiser
 */
public class Mortgage extends Account
    implements MakePayment, CalculateInterest{
    
    private double interestRate, interestAmount;
    private double paymentAmount;
    
    // constructor
    public Mortgage (String name, String number, double balance) {
        this.setAccountName(name);
        this.setAccountNumber(number);
        this.setAccountBalance(balance);
    }
    
    // from MakePayment
    public void makePayment(double amount) {
        setInterestRate(0.0025);
        applyInterest();
        this.setAccountBalance(this.getAccountBalance() - amount);
    }
    public double getPaymentAmount() {
        return paymentAmount;
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
    public double getInterestAmount() {
        return interestAmount;
    }
}
