package lab3;

/**
 *
 * @author chrisgeiser
 */
public class DemonstrateBANK {
    
    public static void main(String[] args) {
        
        Checking myAccount =
                new Checking("Doug's Checking", "000712144", 2035.29);
        
        System.out.println(myAccount.getAccountName() + "   "
            + myAccount.getAccountNumber() + "   "
            + myAccount.getAccountBalance());
        
        myAccount.writeCheck(1, 1000.0);
        
        System.out.println(myAccount.getAccountName() + "   "
            + myAccount.getAccountNumber() + "   "
            + myAccount.getAccountBalance());
              
        myAccount.depositFunds(500.0);
        
        System.out.println(myAccount.getAccountName() + "   "
            + myAccount.getAccountNumber() + "   "
            + myAccount.getAccountBalance());
        
        myAccount.withdrawCash(250);
        
        System.out.println(myAccount.getAccountName() + "   "
            + myAccount.getAccountNumber() + "   "
            + myAccount.getAccountBalance());
    
        myAccount.writeCheck(2, 212.67);
        
        System.out.println(myAccount.getAccountName() + "   "
            + myAccount.getAccountNumber() + "   "
            + myAccount.getAccountBalance());
        
        
        Savings savAcct = new Savings("Sally Savings", "TR0112645", 10450.92);
        
        savAcct.depositFunds(2500);
        
        savAcct.withdrawCash(542);
        
        savAcct.setInterestRate(0.024);
        savAcct.applyInterest();
        
        
        
        CreditCard myCard = new CreditCard("Visa", "4919000247773242", 420.31);
        
        
        
        Mortgage myMortgage = new Mortgage("Home Loan", "GH909118", 190744.08);
        
        
    }
    
}
