/**
 * Write a description of class coursework here.
 *
 * @author (22067675 Sarthak Shrestha)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes    
    private int CardId;
    private String ClientName;
    private String IssuerBank;
    private String BankAccount;
    private int BalanceAmount;
    
    //constructor
    public BankCard(int BalanceAmount, int CardId, String BankAccount, String IssuerBank)
    {
        this.BalanceAmount=BalanceAmount;
        this.CardId=CardId;
        this.BankAccount=BankAccount;
        this.IssuerBank=IssuerBank;
        this.ClientName = "";
    }
    //getter
    public int getCardId()
    {
        return this.CardId;
    }
    public String getClientName() {
        return this.ClientName;
    }
    public String getIssuerBank()
    {
        return this.IssuerBank;
    }
    public String getBankAccount()
    {
        return this.BankAccount;
    }
    public int getBalanceAmount() {
        return this.BalanceAmount;
    }
    //setter
    public void setClientName(String ClientName)
    {
        this.ClientName = ClientName;
    }
    
    public void setBalanceAmount(int BalanceAmount)
    {
        this.BalanceAmount = BalanceAmount;
    }
    //display
    public void display() {
        if (this.ClientName !="") 
        {
            System.out.println("CardId: " + this.CardId);
            System.out.println("ClientName: " + this.ClientName);
            System.out.println("IssuerBank: " + this.IssuerBank);
            System.out.println("BankAccount: " + this.BankAccount);
            System.out.println("BalanceAmount: " + this.BalanceAmount);
        } 
        else 
        {
            System.out.println("Client name not assigned.");
        }
    }
}
