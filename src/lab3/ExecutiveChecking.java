/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chrisgeiser
 */
public class ExecutiveChecking extends Checking implements CalculateInterest {
    
    private double annualInterestRate; 
    
    public ExecutiveChecking (String name, String number, double balance) {
        super(name, number, balance);
    }
    
    
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
