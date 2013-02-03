package lab3;

/**Superclass Account holds 3 variables and their getters and setters.
 * I chose abstract so I could make the methods concrete and final...I thought
 * this would simplify the sub-methods a bit by encapsulating these basic
 * methods here.  The functions are basic enough to not need to change
 * among the various classes.
 *
 * @author chrisgeiser
 */
public abstract class Account {
    private String accountName;
    private String accountNumber;
    private double accountBalance;

    public final String getAccountName() {
        return accountName;
    }

    public final void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public final String getAccountNumber() {
        return accountNumber;
    }

    public final void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public final double getAccountBalance() {
        return accountBalance;
    }

    public final void setAccountBalance(double accountBalance) {
        accountBalance *= 100;
        double rounded = Math.round(accountBalance);
        this.accountBalance = rounded / 100;
    }
    
    
}
