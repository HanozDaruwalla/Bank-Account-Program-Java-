package task.pkg5.bank.account;
import java.util.Scanner;
import java.util.concurrent.TimeUnit; //used to make the program wait

public class MyAccount {
    
   
    public static String Spaces_Function(String Spaces){//prints 5 spaces between each iteration/feature to make layout less clustered
    System.out.println(Spaces);
    return(Spaces);
    }
    
    public static void main(String[] args) {
        
        Task5BankAccount Account = new Task5BankAccount(1122, 20000, 4.5);//object to connect 2 classes together
        
        Double Amount;
        String Choice;
        String Vertical_Spaces = "\n\n\n\n\n";
        //tells user services available
        System.out.println("This program was created by Hanoz Daruwalla (21483405)\n"); 
        
        while(true){//loops til the program is closed
            //Continue = false;
            Spaces_Function(Vertical_Spaces);
            System.out.println("--------- What Do You Want To Do? ---------\n");
            System.out.println("All Information:\n");
            System.out.println("Withdraw:\n");
            System.out.println("Deposit:\n");
            System.out.println("Exit:\n");
            System.out.println("-------------------------------------------\n");
            
            Scanner User_Input = new Scanner(System.in);//scanner initualization is put inside loop to prevent scanner reading wrong line
            Choice = User_Input.nextLine();

            Spaces_Function(Vertical_Spaces);

            switch(Choice){//this switch statement allows the user to access the services available by typing it in.

                case "All Information"://outputs all information such as, ID, Annual Interest Rate, Balance etc.
                    System.out.println("All Information Loading...\n");
                    Account.print();//go to print method in account class 
                    break;
                case "Withdraw"://allows money to be taken out of account
                    System.out.println("***** Welcome To Withdrawals *****\n");
                    System.out.println("How much do you want to Withdraw\n");
                    Amount = User_Input.nextDouble();
                    Account.withdraw(Amount);//go to withdraw method in account class
                    break;
                case "Deposit"://allows the user to put money into the account.
                    System.out.println("***** Welcome To Deposits *****\n");
                    System.out.println("How much do you want to Deposit\n");
                    Amount = User_Input.nextDouble();
                    Account.deposit(Amount);//go to deposit method in account class
                    User_Input.reset();
                    break;
                case "Exit"://exit the program
                    System.out.println("You are now going to exit the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid Entry\n");
                break;
            }//switch
        }//while
    }//main
}//class