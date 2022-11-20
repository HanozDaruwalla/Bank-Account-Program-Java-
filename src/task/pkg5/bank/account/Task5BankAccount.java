package task.pkg5.bank.account;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task5BankAccount {//made by hanoz daruwalla 21483405
    
    //defining attributes.
    private int ID;
    private double Balance;
    private double AnnualInterestRate;
    private Date dateCreated;

    public Task5BankAccount() {//default non args constructor
       ID = 0;
       Balance = 0.0;
       AnnualInterestRate = 0.0;
       dateCreated = new Date();  
    }//for default non args constructor
    
    public Task5BankAccount(int newID, double newBalance, double newAnnualInterestRate) { 
        //argument parametric constructor.
         ID = newID;
         Balance = newBalance;
         AnnualInterestRate = newAnnualInterestRate;
    }    
    
    //getters
    public int getID(){
        return ID;           
    }
    
    public double Balance(){
        return Balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    
    public Date dateCreated(){
        return dateCreated;
    }
    
    //setters
    public void setID(int newID){
        this.ID = newID;
    }
    
    public void setBalance(double newBalance){
        this.Balance = newBalance;
    }
    
    public void setAnnualInterestRate(double newAnnualInterestRate){
        this.AnnualInterestRate = newAnnualInterestRate;
    }
    
    public void setdateCreated(Date newdateCreated){
        
        this.dateCreated = newdateCreated;
        
    }
    
    public double MonthlyInterestRate(){
        return (AnnualInterestRate/12);
    }
    
    //withdraw & deposit
    public double withdraw(double amount){
        
        
        
        if(amount>Balance){//if the user tries to take out more moeny than they have, will tell not enough money and leave function
            
            System.out.println("\n Your Balance Isn't High Enough\n"); 
            return(0);
        }
        System.out.println("\nYou have Withdrew " + "£"+ String.format("%.2f", amount)+ "\n");//says amount withdrawn
        Balance -= amount;
        System.out.println("Your Balance is £" + String.format("%.2f", Balance));//says balance
        return (Balance -= amount);
    }
    
    public double deposit(double amount){//allows user to put money into account
        
        
        System.out.println("\nYou have Deposited " + "£"+ String.format("%.2f", amount)+ "\n");//says amount deposited
        Balance += amount;
        System.out.println("Your Balance is £" + String.format("%.2f", Balance));//says balance
        return (Balance += amount); 
    }
    
    //output
  
    public void print(){//outputs info to the user
        
        Date CurrentDate = new Date();
        SimpleDateFormat Date_Indicator = new SimpleDateFormat("dd/MM/YYYY");
        
        System.out.println("-------------------- Account Details: -------------------- \n");
        System.out.println("Monthly Interest Rate: " + MonthlyInterestRate() + "%\n");
        System.out.println("Annual Interest Rate: " + getAnnualInterestRate()+ "%\n");
        System.out.println("ID: " + getID() + "\n");
        System.out.println("Balance: £" + String.format("%.2f", Balance) + "\n");
        System.out.println("Date Created: " + Date_Indicator.format(CurrentDate) + "\n");
    }

}//class

