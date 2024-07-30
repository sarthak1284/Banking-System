
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067675 Sarthak Shrestha)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //attributes    
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean IsGranted;
    //constructor
    public CreditCard(int CardID, String ClientName, String IssuerBank, String BankAccount, int BalanceAmount, int CVCnumber, double InterestRate, String ExpirationDate)
    {
        super(BalanceAmount, CardID, BankAccount, IssuerBank);
        this.CVCnumber=CVCnumber;
        this.CreditLimit=CreditLimit;
        this.InterestRate=InterestRate;
        this.ExpirationDate=ExpirationDate;
        this.GracePeriod=0;
        this.IsGranted=false;
        super.setClientName(ClientName);
    }
    //getter
    public int getCVCnumber()
    {
        return this.CVCnumber;
    }
     public double getCreditLimit() 
    {
        return this.CreditLimit;
    }
    public double getInterestRate() 
    {
        return this.InterestRate;
    }
    public String getExpirationDate() {
        return this.ExpirationDate;
    }
    public int getGracePeriod() {
        return this.GracePeriod;
    }
    public boolean getIsGranted() {
        return this.IsGranted;
    }
    
    public boolean checkLimit(double enteredLimit) {
    return enteredLimit <= 2.5 * this.getBalanceAmount();
    }
    
    
    //setter
    public void setCreditLimit(double CreditLimit, int GracePeriod) 
    {
        if (CreditLimit <= 2.5 * this.getBalanceAmount()) 
        {
            this.CreditLimit = CreditLimit;
            this.GracePeriod = GracePeriod;
            this.IsGranted = true;
        } 
        else 
        {
            System.out.println("Credit cannot be issued.");
        }
    }
    
    public void cancelCreditCard() 
    {
        if (this.IsGranted) 
        {
            this.CVCnumber = 0;
            this.CreditLimit = 0;
            this.GracePeriod = 0;
            this.IsGranted = false;
        }
    }         
    public void display() 
    {
        super.display();
        if (this.IsGranted) 
        {
            System.out.println("CVCNumber: " + this.CVCnumber);
            System.out.println("CreditLimit: " + this.CreditLimit);
            System.out.println("InterestRate: " + this.InterestRate);
            System.out.println("ExpirationDate: " + this.ExpirationDate);
            System.out.println("GracePeriod: " + this.GracePeriod);
            System.out.println("Credit has been granted");
        } else 
        {
             System.out.println("Credit has not been granted for this card.");
        }
    }
}
