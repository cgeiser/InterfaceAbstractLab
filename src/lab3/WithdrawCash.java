package lab3;

/**WithdrawCash, MakePayment, WriteCheck are all very similar methods.
 * Having just read the DIP article, I could have had a "withdraw" superclass
 * and made different cash, payment, check subclasses.
 *
 * @author chrisgeiser
 */
public interface WithdrawCash {
    
    public void withdrawCash(double amount);
    
    public double getWithdrawAmount();
    
}
