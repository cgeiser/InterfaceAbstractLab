package lab3;

/**ExecutiveChecking is an interest-bearing subclass of Checking.  It extends
 * Checking and implements CalculateInterest to add interest functionality
 * to a checking acct.
 *
 * @author chrisgeiser
 */
public class ExecutiveChecking extends Checking implements CalculateInterest {
    
    private double interestRate, interestAmount; 
    
    public ExecutiveChecking (String name, String number, double balance) {
        super(name, number, balance);
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
