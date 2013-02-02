/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chrisgeiser
 */
public class Savings extends Account
    implements WithdrawCash, DepositFunds {
    
    private double withdrawAmount, depositAmount, annualInterestRate;
    
    
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
