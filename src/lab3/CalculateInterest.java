package lab3;

/**Works well as an interface because the inheriting classes can have their
 * own different methods for calculating interest if needed.
 *
 * @author chrisgeiser
 */
public interface CalculateInterest {
    
    public void applyInterest();
    
    public void setInterestRate(double interestRate);
    
    public double getInterestRate();
    
}
