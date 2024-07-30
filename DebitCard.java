/**
 * Write a description of class DebitCard here.
 *
 * @author (22067675 Sarthak Shrestha)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //attributes    
    private int PINnumber;
    private int WithdrawalAmount;
    private String DateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor
    public DebitCard(int BalanceAmount, int CardId, String BankAccount, String IssuerBank, String ClientName, int PINnumber)
    {
        //call to the parent constructor
        //IMP: in the same order
        super(BalanceAmount, CardId, BankAccount, IssuerBank);
        this.PINnumber = PINnumber;
        this.WithdrawalAmount = 0;
        this.DateOfWithdrawal = "";
        this.hasWithdrawn = false;
        super.setClientName(ClientName);
    }
    
    //getter
    public int getPINnumber(){
        return this.PINnumber;
    }
    public int getWithdrawalAmount() {
        return this.WithdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return this.DateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return this.hasWithdrawn;
    }
    
    //setter
    public void setWithdrawalAmount(int WithdrawalAmount) 
    {
        this.WithdrawalAmount = WithdrawalAmount;
    }
    
    public boolean checkPIN(int enteredPINnumber) {
    return enteredPINnumber == this.PINnumber;
    }
    
    //method
    public void withdraw(int WithdrawalAmount, String DateOfWithdrawal, int enteredPINnumber) 
    {
         if (enteredPINnumber == this.PINnumber) 
         {
             if (WithdrawalAmount <= this.getBalanceAmount()) 
             {
                 this.setBalanceAmount(this.getBalanceAmount() - WithdrawalAmount);
                 this.WithdrawalAmount = WithdrawalAmount;
                 this.DateOfWithdrawal = DateOfWithdrawal;
                 this.hasWithdrawn = true;
                 System.out.println("Transaction successful.");
             }
             else 
             {
                System.out.println("Insufficient balance.");
            }
        } 
        else 
        {
            System.out.println("Invalid PIN.");
        }
    }
    
    //display
    public void display() {
        //parent class display call
        //if transaction:
        //display everything
        //else
        //display everything except
        super.display();
        if (this.hasWithdrawn==true) {
            System.out.println("Pin Number: " + this.PINnumber);
            System.out.println("Withdrawal Amount: " + this.WithdrawalAmount);
            System.out.println("Date of Withdrawal: " + this.DateOfWithdrawal);
        } 
        else 
        {
            System.out.println("Transaction not carried yet.");
        }
    }
}
