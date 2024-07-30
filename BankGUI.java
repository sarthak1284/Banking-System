
/**
 * Write a description of class news here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.util.*;
// Step 1: Implementing the Action Listener Interface
public class BankGUI implements ActionListener
{
    private JFrame frame;
    
    private JPanel p1, p2;
    
    private JTabbedPane tb;
    
    private JLabel DebitCard, CardID1, Name1, Bank1, Account1, Amount1, PIN1;
    private JTextField CardID1Text, Name1Text, Bank1Text, Account1Text, Amount1Text, PIN1Text;
    private JButton AddDebit;
    
    private JLabel CardID2, Withdrawal, PIN2, DOW;
    private JTextField CardID2Text, WithdrawalText, PIN2Text;
    private JButton Withdraw, Display1, Clear1, Change1;
    private JComboBox Date1Combo, Month1Combo, Year1Combo;
    
    private JLabel CreditCard, CardID3, Name2, Bank2, Account2, Amount2, CVC, Interest, Expdate;
    private JTextField CardID3Text, Name2Text, Bank2Text, Account2Text, Amount2Text, CVCText, InterestText;
    private JButton AddCredit;
    private JComboBox Date2Combo, Month2Combo, Year2Combo;
    
    private JLabel CardID4, Limit, Period;
    private JTextField CardID4Text, LimitText, PeriodText;
    private JButton Change2, Display2, Clear2, SetCredit, CancelCredit;
    
    ArrayList<BankCard>Cards = new ArrayList<BankCard>();
    public void gui_BankGUI(){
        frame = new JFrame("BankGUI");
        
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1920,1080);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,0,1920,1080);
        
        tb = new JTabbedPane();
        tb.add("Debit Card",p1);
        tb.add("Credit Card",p2);
        
        DebitCard = new JLabel("Debit Card");
        DebitCard.setBounds(745, 70, 250, 36);
        DebitCard.setFont(new Font("Arial", Font.BOLD, 40));
        p1.add(DebitCard);
        
        CardID1 = new JLabel("Card ID: ");
        CardID1.setBounds(450, 200, 120, 30);
        CardID1.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(CardID1);
        
        CardID1Text = new JTextField();
        CardID1Text.setBounds(600, 200, 180, 30);
        p1.add(CardID1Text);
        
        Name1 = new JLabel("Client Name: ");
        Name1.setBounds(900, 200, 120, 30);
        Name1.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(Name1);
        
        Name1Text = new JTextField();
        Name1Text.setBounds(1070, 200, 180, 30);
        p1.add(Name1Text);
        
        Bank1 = new JLabel("Issuer Bank: ");
        Bank1.setBounds(450, 250, 120, 30);
        Bank1.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(Bank1);
        
        Bank1Text = new JTextField();
        Bank1Text.setBounds(600, 250, 180, 30);
        p1.add(Bank1Text);
        
        Account1 = new JLabel("Bank Account: ");
        Account1.setBounds(900, 250, 150, 30);
        Account1.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(Account1);
        
        Account1Text = new JTextField();
        Account1Text.setBounds(1070, 250, 180, 30);
        p1.add(Account1Text);
        
        Amount1 = new JLabel("Balance Amount: ");
        Amount1.setBounds(450, 300, 150, 30);
        Amount1.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(Amount1);
        
        Amount1Text = new JTextField();
        Amount1Text.setBounds(600, 300, 180, 30);
        p1.add(Amount1Text);
        
        PIN1 = new JLabel("PIN number: ");
        PIN1.setBounds(900, 300, 120, 30);
        PIN1.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(PIN1);
        
        PIN1Text = new JTextField();
        PIN1Text.setBounds(1070, 300, 180, 30);
        p1.add(PIN1Text);
        
        AddDebit = new JButton("Add a Debit Card");
        AddDebit.setBounds(780, 400, 150, 40);
        AddDebit.setFont(new Font("Arial", Font.BOLD, 13));
        p1.add(AddDebit);
        
        CardID2 = new JLabel("Card ID: ");
        CardID2.setBounds(450, 500, 120, 30);
        CardID2.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(CardID2);
        
        CardID2Text = new JTextField();
        CardID2Text.setBounds(600, 500, 180, 30);
        p1.add(CardID2Text);
        
        Withdrawal = new JLabel("Withdrawal Amount: ");
        Withdrawal.setBounds(900, 500, 180, 30);
        Withdrawal.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(Withdrawal);
        
        WithdrawalText = new JTextField();
        WithdrawalText.setBounds(1100, 500, 180, 30);
        p1.add(WithdrawalText);
        
        PIN2 = new JLabel("PIN number: ");
        PIN2.setBounds(450, 550, 120, 30);
        PIN2.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(PIN2);
        
        PIN2Text = new JTextField();
        PIN2Text.setBounds(600, 550, 180, 30);
        p1.add(PIN2Text);
        
        DOW = new JLabel("Date Of Withdrawal: ");
        DOW.setBounds(900, 550, 180, 30);
        DOW.setFont(new Font("Arial", Font.BOLD, 17));
        p1.add(DOW);
        
        String [] Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String [] Date = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
            "27", "28", "29", "30", "31"};
        String [] Year = {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"};
        
        Date1Combo = new JComboBox(Date);
        Month1Combo = new JComboBox(Month);
        Year1Combo = new JComboBox(Year);
        
        p1.add(Date1Combo);
        p1.add(Month1Combo);
        p1.add(Year1Combo);
        
        Date1Combo.setBounds(1100, 550, 50, 30);
        Month1Combo.setBounds(1170, 550, 85, 30);
        Year1Combo.setBounds(1275, 550, 60, 30);
        
        Withdraw = new JButton("Withdraw From Debit Card");
        Withdraw.setBounds(585, 650, 220, 40);
        Withdraw.setFont(new Font("Arial", Font.BOLD, 13));
        p1.add(Withdraw);
        
        Display1 = new JButton("Display");
        Display1.setBounds(1000, 650, 100, 40);
        Display1.setFont(new Font("Arial", Font.BOLD, 15));
        p1.add(Display1);
        
        Clear1 = new JButton("Clear");
        Clear1.setBounds(800, 750, 100, 40);
        Clear1.setFont(new Font("Arial", Font.BOLD, 15));
        p1.add(Clear1);
        
        Change1 = new JButton("Change to Credit Card");
        Change1.setBounds(250, 800, 180, 40);
        Change1.setFont(new Font("Arial", Font.BOLD, 13));
        p1.add(Change1);
        
        CreditCard = new JLabel("Credit Card");
        CreditCard.setBounds(745, 70, 250, 36);
        CreditCard.setFont(new Font("Arial", Font.BOLD, 40));
        p2.add(CreditCard);
        
        CardID3 = new JLabel("Card ID: ");
        CardID3.setBounds(450, 200, 120, 30);
        CardID3.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(CardID3);
        
        CardID3Text = new JTextField();
        CardID3Text.setBounds(600, 200, 180, 30);
        p2.add(CardID3Text);
        
        Name2 = new JLabel("Client Name: ");
        Name2.setBounds(900, 200, 120, 30);
        Name2.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Name2);
        
        Name2Text = new JTextField();
        Name2Text.setBounds(1070, 200, 180, 30);
        p2.add(Name2Text);
        
        Bank2 = new JLabel("Issuer Bank: ");
        Bank2.setBounds(450, 250, 120, 30);
        Bank2.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Bank2);
        
        Bank2Text = new JTextField();
        Bank2Text.setBounds(600, 250, 180, 30);
        p2.add(Bank2Text);
        
        Account2 = new JLabel("Bank Account: ");
        Account2.setBounds(900, 250, 150, 30);
        Account2.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Account2);
        
        Account2Text = new JTextField();
        Account2Text.setBounds(1070, 250, 180, 30);
        p2.add(Account2Text);
        
        Amount2 = new JLabel("Balance Amount: ");
        Amount2.setBounds(450, 300, 150, 30);
        Amount2.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Amount2);
        
        Amount2Text = new JTextField();
        Amount2Text.setBounds(600, 300, 180, 30);
        p2.add(Amount2Text);
        
        CVC = new JLabel("CVC Number: ");
        CVC.setBounds(900, 300, 150, 30);
        CVC.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(CVC);
        
        CVCText = new JTextField();
        CVCText.setBounds(1070, 300, 180, 30);
        p2.add(CVCText);
        
        Interest = new JLabel("Interest Rate: ");
        Interest.setBounds(450, 350, 150, 30);
        Interest.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Interest);
        
        InterestText = new JTextField();
        InterestText.setBounds(600, 350, 180, 30);
        p2.add(InterestText);
        
        Expdate = new JLabel("Expiration Date: ");
        Expdate.setBounds(900, 350, 180, 30);
        Expdate.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Expdate);
        
        Date2Combo = new JComboBox(Date);
        Month2Combo = new JComboBox(Month);
        Year2Combo = new JComboBox(Year);
        
        p2.add(Date2Combo);
        p2.add(Month2Combo);
        p2.add(Year2Combo);
        
        Date2Combo.setBounds(1070, 350, 50, 30);
        Month2Combo.setBounds(1140, 350, 85, 30);
        Year2Combo.setBounds(1245, 350, 60, 30);
        
        AddCredit = new JButton("Add a Credit Card");
        AddCredit.setBounds(780, 450, 150, 40);
        AddCredit.setFont(new Font("Arial", Font.BOLD, 13));
        p2.add(AddCredit);
        
        CardID4 = new JLabel("Card ID: ");
        CardID4.setBounds(450, 550, 120, 30);
        CardID4.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(CardID4);
        
        CardID4Text = new JTextField();
        CardID4Text.setBounds(600, 550, 180, 30);
        p2.add(CardID4Text);
        
        Period = new JLabel("Grace Period: ");
        Period.setBounds(900, 550, 120, 30);
        Period.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Period);
        
        PeriodText = new JTextField();
        PeriodText.setBounds(1070, 550, 180, 30);
        p2.add(PeriodText);
        
        Limit = new JLabel("Credit Limit: ");
        Limit.setBounds(450, 600, 120, 30);
        Limit.setFont(new Font("Arial", Font.BOLD, 17));
        p2.add(Limit);
        
        LimitText = new JTextField();
        LimitText.setBounds(600, 600, 180, 30);
        p2.add(LimitText);
        
        SetCredit = new JButton("Set Credit Limit");
        SetCredit.setBounds(900, 600, 150, 40);
        SetCredit.setFont(new Font("Arial", Font.BOLD, 13));
        p2.add(SetCredit);
        
        Display2 = new JButton("Display");
        Display2.setBounds(1150, 600, 100, 40);
        Display2.setFont(new Font("Arial", Font.BOLD, 15));
        p2.add(Display2);
        
        CancelCredit = new JButton("Cancel Credit Card");
        CancelCredit.setBounds(600, 700, 180, 40);
        CancelCredit.setFont(new Font("Arial", Font.BOLD, 13));
        p2.add(CancelCredit);
        
        Clear2 = new JButton("Clear");
        Clear2.setBounds(900, 700, 100, 40);
        Clear2.setFont(new Font("Arial", Font.BOLD, 15));
        p2.add(Clear2);
        
        Change2 = new JButton("Change to Debit Card");
        Change2.setBounds(250, 800, 180, 40);
        Change2.setFont(new Font("Arial", Font.BOLD, 13));
        p2.add(Change2);
        
        frame.add(tb);
        
        // adding addActionListener to all the buttons
        AddDebit.addActionListener(this);
        Change1.addActionListener(this);
        Withdraw.addActionListener(this);
        Display1.addActionListener(this);
        Clear1.addActionListener(this);

        AddCredit.addActionListener(this);
        SetCredit.addActionListener(this);
        Clear2.addActionListener(this);
        Display2.addActionListener(this);
        CancelCredit.addActionListener(this);
        Change2.addActionListener(this);
        
        frame.setBounds(0,0,1920,1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        // event handling and exception handling
        // for clearing the text fields of Debit Card
        if(e.getSource() == Clear1)
        {
            CardID1Text.setText("");
            Name1Text.setText("");
            Amount1Text.setText("");
            Bank1Text.setText("");
            Account1Text.setText("");
            PIN1Text.setText("");
            CardID2Text.setText("");
            PIN2Text.setText("");
            WithdrawalText.setText("");
        }
        // for clearing the text fields of Credit card
        if(e.getSource() == Clear2)
        {
            CardID3Text.setText("");
            Name2Text.setText("");
            Amount2Text.setText("");
            Bank2Text.setText("");
            Account2Text.setText("");
            CVCText.setText("");
            InterestText.setText("");
            CardID4Text.setText("");
            LimitText.setText("");
            PeriodText.setText("");
        }
        // for adding of debit card
        if(e.getSource() == AddDebit)
        {
             try{
                // extracting the texts from the text fields
                String CardID1 = CardID1Text.getText();
                String Name1 = Name1Text.getText();
                String Bank1 = Bank1Text.getText();
                String Account1 = Account1Text.getText();
                String Amount1 = Amount1Text.getText();
                String PIN1 = PIN1Text.getText();
                
                // declaring boolean value for duplicate addition
                boolean isAdded = false;
                
                // checking for an empty field
                if(CardID1.isEmpty() || Name1.isEmpty() || Amount1.isEmpty() || Bank1.isEmpty() || Account1.isEmpty() || PIN1.isEmpty())
                {
                    throw new Exception();
                    
                }
                else
                {
                    // parsing of String to Integer
                    int CardID_1 = Integer.parseInt(CardID1);
                    int PIN_1 = Integer.parseInt(PIN1);
                    int Amount_1 = Integer.parseInt(Amount1);
            
                    // downcasting of BankCard Class to Debit Card object by iteration through all items on loop
                    // downcasting of the Arraylist of Bankcard class so that each object of the arraylist is examined
                    for(BankCard bankcard_class: Cards)
                    {
                        if (bankcard_class instanceof DebitCard) 
                        {
                            DebitCard debit_card = (DebitCard) bankcard_class;
                            if((debit_card.getCardId()) == (CardID_1))
                            {
                                isAdded = true;
                            }
                        }
                    }
                    // for a card id which is already added with display of error message
                    if(isAdded == true)
                    {
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardID_1 + " has already been added.", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                    // for Card id not added yet,
                    else if(isAdded == false)
                    {
                       // creation of object of Debit Card
                       DebitCard card_debit = new DebitCard(Amount_1, CardID_1, Account1, Bank1, Name1, PIN_1);
                       // Addition of object to arraylist of debit card
                       Cards.add(card_debit);
                       JOptionPane.showMessageDialog(frame,"Debit Card has been added" + "\n" + "Card Id:" + CardID1 + "\n" + "Client Name:" + Name1 + "\n" + "Balance Amount:" + Amount1 + "\n" + "Issuer Bank:" + Bank1 + "\n" + "Bank Account" + Account1 + "\n" + "PIN number:" + PIN1 ,"Debit Card is Successfully added" ,JOptionPane.INFORMATION_MESSAGE);
                       
                    }
                
                }
            }
            // catching of NumberFormatException
            catch(NumberFormatException num_ex)
            {
                JOptionPane.showMessageDialog(frame,"Card Id, PIN number, Balance Amount must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        // for withdrawing from debit card
        if(e.getSource() == Withdraw)
        {
            try
            {
                // extracting the texts from the text fields
                String CardID2 = CardID2Text.getText();
                String Withdrawal = WithdrawalText.getText();
                String PIN2 = PIN2Text.getText();
                String Amount1 = Amount1Text.getText();
                String Date = (String)Date1Combo.getSelectedItem();
                String Month = (String)Month1Combo.getSelectedItem();
                String Year = (String)Year1Combo.getSelectedItem();
                String DOW = Date + "" + Month + "" + Year;
                
                // checking for an empty field
                if(CardID2.isEmpty() || Withdrawal.isEmpty() || PIN2.isEmpty())
                {
                    throw new Exception();
                }
                else
                {
                    // parsing of String to Integer
                    int CardID_2 = Integer.parseInt(CardID2);
                    int PIN_2 = Integer.parseInt(PIN2);
                    int Withdrawal_1 = Integer.parseInt(Withdrawal);
                    int Amount_1 = Integer.parseInt(Amount1);
                    boolean cardFound = false;
                    
                    // iterating through all the DebitCard objects in the ArrayList to find the one with the matching Card ID
                    for(BankCard bankcard_class: Cards)
                    {
                        if (bankcard_class instanceof DebitCard) 
                        {
                            DebitCard debit_card = (DebitCard) bankcard_class;
                            if((debit_card.getCardId()) == (CardID_2))
                            {
                                cardFound = true;
                                // check if the PIN is correct
                                if(debit_card.checkPIN(PIN_2))
                                {
                                
                                    debit_card.withdraw(Withdrawal_1, DOW, PIN_2);
                                    if(Amount_1 >= Withdrawal_1){  
                                        JOptionPane.showMessageDialog(frame, Withdrawal_1 + " has been withdrawn from Card ID " + CardID_2, "Withdrawal Successful", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(frame, Withdrawal_1 + " cannot be withdrawn from Card ID " + CardID_2, "Withdrawal Unsuccessful", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame,"Invalid PIN.", "ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                                break; // exit the loop if card is found
                            }
                        }
                    }
                    // if Card ID not found
                    if(!cardFound)
                    {
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardID_2 + " is not found in the system.", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            // catching of NumberFormatException
            catch(NumberFormatException num_ex)
            {
                JOptionPane.showMessageDialog(frame,"Card Id, PIN number, Withdrawal Amount must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
         // for display button of debit card
        if(e.getSource() == Display1){
            try{
                if(Cards.size() == 0){
                    throw new Exception();
                    
                }
                else{
                    for (BankCard bank_card : Cards){
                        // downcasting of bank card class to debit card object type by iteration, and calling display method
                        if(bank_card instanceof DebitCard){
                            DebitCard card_debit = (DebitCard) bank_card;
                            System.out.println("The details of Debit Card are as follows:");
                            card_debit.display();
                        }
                        
                    }
                }
            }
            catch(Exception emp_exc){
                JOptionPane.showMessageDialog(frame,"The Debit Card is empty.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        // for changing to credit tab
        if(e.getSource() == Change1){
            int currentTab = tb.getSelectedIndex();
                int nextTab= (currentTab + 1) % tb.getTabCount();
                tb.setSelectedIndex(nextTab);
        }
        // for adding credit card
        if(e.getSource() == AddCredit)
        {
             try{
                // extracting the texts from the text fields
                String CardID3 = CardID3Text.getText();
                String Name2 = Name2Text.getText();
                String Bank2 = Bank2Text.getText();
                String Account2 = Account2Text.getText();
                String Amount2 = Amount2Text.getText();
                String CVC = CVCText.getText();
                String Interest = InterestText.getText();
                String Date = (String)Date2Combo.getSelectedItem();
                String Month = (String)Month2Combo.getSelectedItem();
                String Year = (String)Year2Combo.getSelectedItem();
                String Expiration = Date + "" + Month + "" + Year;
                
                // declaring boolean value for duplicate addition
                boolean isAdded = false;
                
                // checking for an empty field
                if(CardID3.isEmpty() || Name2.isEmpty() || Bank2.isEmpty() || Account2.isEmpty() || Amount2.isEmpty() ||  CVC.isEmpty() ||  Interest.isEmpty() ||  Expiration.isEmpty())
                {
                    throw new Exception();
                    
                }
                else
                {
                    // parsing of String to Integer
                    int CardID_3 = Integer.parseInt(CardID3);
                    int CVC_1 = Integer.parseInt(CVC);
                    double Interest_1 = Double.parseDouble(Interest);
                    int Amount_2 = Integer.parseInt(Amount2);
            
                    // downcasting of BankCard Class to Credit Card object by iteration through all items on loop
                    // downcasting of the Arraylist of Bankcard class so that each object of the arraylist is examined
                    for(BankCard bankcard_class: Cards)
                    {
                        if (bankcard_class instanceof CreditCard) 
                        {
                            CreditCard Cards = (CreditCard) bankcard_class;
                            if((Cards.getCardId()) == (CardID_3))
                            {
                                isAdded = true;
                            }
                        }
                    }
                    // for a card id which is already added with display of error message
                    if(isAdded == true)
                    {
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardID_3 + " has already been added.", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                    // for Card id not added yet,
                    else if(isAdded == false)
                    {
                       // creation of object of Credit Card
                       CreditCard card_credit = new CreditCard(CardID_3, Name2, Bank2, Account2, Amount_2, CVC_1, Interest_1, Expiration);
                       // Addition of object to arraylist of Credit card
                       Cards.add(card_credit);
                       JOptionPane.showMessageDialog(frame,"Credit Card has been added" + "\n" + "Card Id: " + CardID3 + "\n" + "Client Name: " + Name2 + "\n" + "Balance Amount: " + Amount2 + "\n" + "Issuer Bank: " + Bank2 + "\n" + "Bank Account: " + Account2 + "\n" + "CVC number: " + CVC + "\n" + "Interest Rate: " + Interest + "\n" + "Expiration Date: " + Expiration ,"Credit Card is Successfully added" ,JOptionPane.INFORMATION_MESSAGE);
                       
                    }
                
                }
            }
            // catching of NumberFormatException
            catch(NumberFormatException num_ex)
            {
                JOptionPane.showMessageDialog(frame,"Card Id, PIN number, Balance Amount, Interest must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        // for Setting credit Limit
        if(e.getSource() == SetCredit)
        {
            try{
                // extracting the texts from the text fields
                String CardID4 = CardID4Text.getText();
                String Limit = LimitText.getText();
                String Period = PeriodText.getText();
                
                // checking for an empty field
                if(CardID4.isEmpty() || Limit.isEmpty() || Period.isEmpty())
                {
                    throw new Exception();
                }
                else
                {
                    // parsing of String to Integer
                    int CardID_4 = Integer.parseInt(CardID4);
                    double Limit_1 = Double.parseDouble(Limit);
                    int Period_1 = Integer.parseInt(Period);
                    boolean cardFound = false;
                    
                    // iterating through all the DebitCard objects in the ArrayList to find the one with the matching Card ID
                    for(BankCard bankcard_class: Cards)
                    {
                        if (bankcard_class instanceof CreditCard) 
                        {
                            CreditCard credit_card = (CreditCard) bankcard_class;
                            if((credit_card.getCardId()) == (CardID_4))
                            {
                                cardFound = true;
                                // check if the PIN is correct
                                if(credit_card.checkLimit(Limit_1))
                                {
                                
                                    credit_card.setCreditLimit(Limit_1, Period_1);
                                    JOptionPane.showMessageDialog(frame, Limit_1 + " has been set to Card ID " + CardID_4, "Credit Limit is successfully added", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame,"Credit cannot be issued..", "ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                                break; // exit the loop if card is found
                            }
                        }
                    }
                    // if Card ID not found
                    if(!cardFound)
                    {
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardID_4 + " is not found in the system.", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
                // catching of NumberFormatException
                catch(NumberFormatException num_ex)
                {
                    JOptionPane.showMessageDialog(frame,"Card Id, Credit Limit, Grace Period must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        // for display button of Credit card
        if(e.getSource() == Display2){
            try{
                if(Cards.size() == 0){
                    throw new Exception();
                    
                }
                else{
                    for (BankCard bank_card : Cards){
                        // downcasting of bank card class to credit card object type by iteration, and calling display method
                        if(bank_card instanceof CreditCard){
                            CreditCard card_credit = (CreditCard) bank_card;
                            System.out.println("The details of Credit Card are as follows:");
                            card_credit.display();
                        }
                    }
                }
            }
            catch(Exception emp_exc){
                JOptionPane.showMessageDialog(frame,"The Credit Card is empty.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }   
        }
        // for cancelling credit card
        if(e.getSource() == CancelCredit)
        {
            try{
                // extracting the texts from the text fields
                String CardID4 = CardID4Text.getText();
                
                // checking for an empty field
                if(CardID4.isEmpty())
                {
                    throw new Exception();
                }
                else
                {
                    // parsing of String to Integer
                    int CardID_4 = Integer.parseInt(CardID4);
                    boolean cardFound = false;
                    
                    // iterating through all the DebitCard objects in the ArrayList to find the one with the matching Card ID
                    for(BankCard bankcard_class: Cards)
                    {
                        if (bankcard_class instanceof CreditCard) 
                        {
                            CreditCard credit_card = (CreditCard) bankcard_class;
                            if((credit_card.getCardId()) == (CardID_4))
                            {
                                cardFound = true;
                                
                                    credit_card.cancelCreditCard();
                                    JOptionPane.showMessageDialog(frame, "The credit card with credit card ID: " + CardID_4 + " has been cancelled ", "Action Successful", JOptionPane.INFORMATION_MESSAGE);
                                break; // exit the loop if card is found
                            }
                        }
                    }
                    // if Card ID not found
                    if(!cardFound)
                    {
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardID_4 + " is not found in the system.", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
                // catching of NumberFormatException
                catch(NumberFormatException num_ex)
                {
                    JOptionPane.showMessageDialog(frame,"Card Id must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        // for changing to debit tab
        if(e.getSource() == Change2){
            int currentTab = tb.getSelectedIndex();
                int nextTab = (currentTab - 1) % tb.getTabCount();
                tb.setSelectedIndex(nextTab);
        }
    }
    
    public static void main(String[] args){
        new BankGUI().gui_BankGUI();
    }
}