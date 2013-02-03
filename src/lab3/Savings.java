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
