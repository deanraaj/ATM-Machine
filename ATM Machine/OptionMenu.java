
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    int selection;

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    // GET ACCOUNT TYPE
    public void getAccountType() throws IOException {
        System.out.println("Select the Account you want to Access : ");
        System.out.println("Type 1 : Checking Account");
        System.out.println("Type 2 : Saving Account");
        System.out.println("Type 3 : Exit");
        
        selection = menuInput.nextInt();

        switch(selection){
            case 1 : 
                getChecking();
                break;
            case 2 : 
                getSavingAccount();
                break;
            case 3 : 
                System.out.println("Thank you for using this ATM.  Bye");
                break;
            default : 
                System.out.println("\n Invalid choice \n");
                getAccountType();
        }
    }


    // GET CHECKING
    public void getChecking() throws IOException{
        System.out.println("Checking Account : ");
        System.out.println("Type 1 : View Balance ");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3 : Deposit Funds");
        System.out.println("Type 4 : Exit");
        System.out.print("Your Choice : ");

        selection = menuInput.nextInt();

        switch(selection){
            case 1 : 
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2 : 
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3 : 
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4 : 
                System.out.println("Thank you for using this ATM ");
                break;
            default:
                System.out.println("\n Invalid Choice \n");
                getChecking();
        }
    }


    // SAVING ACCOUNT
    public void getSavingAccount() throws IOException {
        System.out.println("Saving Account : ");
        System.out.println("Type 1 : View Balance ");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3 : Deposit Funds");
        System.out.println("Type 4 : Exit");
        System.out.print("Your Choice : ");

        selection = menuInput.nextInt();

        switch(selection){
            case 1 : 
                System.out.println("Checking Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2 : 
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3 : 
                getSavingDepositInput();
                getAccountType();
                break;
            case 4 : 
                System.out.println("Thank you for using this ATM ");
                break;
            default:
                System.out.println("\n Invalid Choice \n");
                getSavingAccount();
        }
    }


    // GET LOGIN
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(63010236, 3108);
                data.put(63036233, 6303);

                System.out.println("Welcome to the ATM Project");
                
                System.out.print("Enter your Customer Number : ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your four digit pin : ");
                setPin(menuInput.nextInt());

            } catch(Exception e){
                System.out.println("\n" + "Invalid Character(s). Only numbers." + "\n");
                x = 2;
            }
            for(java.util.Map.Entry<Integer, Integer> entry : data.entrySet()){
                if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPint()){
                    getAccountType();
                }
            }
            System.out.println("\n Wrong Customer or Pin Number /n");
        } while(x==1);
    }


    
}