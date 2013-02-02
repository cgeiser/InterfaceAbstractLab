/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chrisgeiser
 */
public class Checking extends Account 
    implements WriteCheck, DepositFunds, WithdrawCash {
    
    private double checkAmount[];
    private double depositAmount;
    
    // constructor
    public Checking (String name, String number, double balance) {
        this.setAccountName(name);
        this.setAccountNumber(number);
        this.setAccountBalance(balance);
    }
    
    // from Interface WriteCheck
    public void writeCheck(int number, double amount) {
        checkAmount[number] = amount;
        this.setAccountBalance(this.getAccountBalance() - amount);
    }
    
    public double getCheckAmount(int number) {
        return checkAmount[number];
    }
    
    // from Interface DepositFunds
    public void depositFunds(double amount){
        depositAmount = amount;
        this.setAccountBalance(this.getAccountBalance() + depositAmount);
    }
    
    public double getDepositAmount(){
        return depositAmount;
    }
    
    // from Interface WithdrawCash
    
}
