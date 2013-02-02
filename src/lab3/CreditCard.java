/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chrisgeiser
 */
public class CreditCard extends Account
    implements MakePayment, CalculateInterest {
    
    private double annualInterestRate;
    
    // from CalculateInterest
    public double getInterest() {
        return 0;
    }
    public void setInterestRate(double interestRate) {
        if (interestRate <= 0) {
            System.out.println("Invalid interest entry.");
            System.exit(0);
        }
        annualInterestRate = interestRate;
    }
    
}
