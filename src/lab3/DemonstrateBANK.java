package lab3;

/**Demonstration instantiates one example of each concrete class and 
 * performs several actions on each, displaying the accountName,
 * accountNumber, and accountBalance after each.
 *
 * @author chrisgeiser
 */
public class DemonstrateBANK {
    
    public static void main(String[] args) {
        
        Checking myAccount =
                new Checking("Doug's Checking", "000712144", 2035.29);
        displayInfo(myAccount);
        
        myAccount.writeCheck(1, 1000.0);
        displayInfo(myAccount);
              
        myAccount.depositFunds(500.0);
        displayInfo(myAccount);
        
        myAccount.withdrawCash(250);
        displayInfo(myAccount);
    
        myAccount.writeCheck(2, 212.67);
        displayInfo(myAccount);
        
        
        
        Savings savAcct = new Savings("Sally Savings", "TR0112645", 10450.92);
        displayInfo(savAcct);
        
        savAcct.depositFunds(2500);
        displayInfo(savAcct);
        
        savAcct.withdrawCash(542);
        displayInfo(savAcct);
        
        savAcct.setInterestRate(0.024);
        savAcct.applyInterest();
        displayInfo(savAcct);
        
        
        
        CreditCard myCard = new CreditCard("Visa", "4919000247773242", 420.31);
        displayInfo(myCard);
        
        myCard.makePayment(400.0);
        displayInfo(myCard);
        
        
        
        Mortgage myMortgage = new Mortgage("Home Loan", "GH909118", 190744.08);
        displayInfo(myMortgage);
        
        myMortgage.makePayment(950.0);
        displayInfo(myMortgage);
                
        
        
        ExecutiveChecking execCheck = new ExecutiveChecking("Fancy Checking",
                "VIP00873", 20988.37);
        displayInfo(execCheck);
        
        execCheck.writeCheck(1, 1200.0);
        displayInfo(execCheck);
        
        execCheck.depositFunds(8240.94);
        displayInfo(execCheck);
        
        execCheck.setInterestRate(0.01);
        execCheck.applyInterest();
        displayInfo(execCheck);
        
    }
    
    public static void displayInfo(Account a) {
        System.out.println(a.getAccountName() + "   " + a.getAccountNumber()
                + "   " + a.getAccountBalance());
    }
    
}
