
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    private int CustomerNumber;
    private int PinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    /*  CUSTOMER NUMBER */
    // SET CUSTOMER NUMBER
    public int setCustomerNumber(int cusNum){
        this.CustomerNumber = cusNum;
        return CustomerNumber;
    }
    // GET CUSTOMER NUMBER
    public int getCustomerNumber(){
        return CustomerNumber;
    }

    /*  PIN  */
    // SET PIN
    public int setPin(int pin){
        this.PinNumber = pin;
        return PinNumber;
    }
    // GET PIN
    public int getPint(){
        return PinNumber;
    }


    /*  get CHECKING ACCOUNT BALANCE    */
    public double getCheckingBalance(){
        return checkingBalance;
    }

    /*   GET SAVING ACCOUNT BALANCE   */
    public double getSavingBalance(){
        return savingBalance;
    }

    /*  checking Account after WITHDRAWL */
    public double calcCheckingWithdrwal(double Amount){
        checkingBalance = (checkingBalance - Amount);
        return checkingBalance;
    }


    /*  Saving Account Balance  WITHDRAWL   */
    public double calcSavingWithdrawl(double Amount){
        savingBalance = (savingBalance - Amount);
        return savingBalance;
    }


    /*  checking Account after DEPOSIT */
    public double calcCheckingDeposit(double Amount){
        checkingBalance = (checkingBalance + Amount);
        return checkingBalance;
    }


    /*  Saving Account Balance  DEPOSIT   */
    public double calcSavingDeposit(double Amount){
        savingBalance = (savingBalance + Amount);
        return savingBalance;
    }

    /*  GET CHECKING WITHDRAW INPUT  */
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.println("\n Enter Amount you want to withdrawn \n");

        double Amount = input.nextDouble();

        if((checkingBalance - Amount) >= 0){
            calcCheckingWithdrwal(Amount);
            System.out.println("New Checking Account Balance : " + moneyFormat.format(calcCheckingWithdrwal(Amount)));
        } else {
            System.out.println("Balance can not be Negative. \n");
        }
    }


    /* GET SAVING WITHDRAW INPUT */
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.println("\n Enter amount you want to withdrawn \n");

        double Amount = input.nextDouble();

        if((savingBalance - Amount) >= 0){
            System.out.println("New Saving Account Balance : " + moneyFormat.format(calcSavingWithdrawl(Amount)));
        } else {
            System.out.println("\n Balance can not be Negative \n");
        }
    }

    /*  GET CHECKING DEPOSIT INPUT  */
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.println("\n Enter the amount you want to Deposit \n");

        double Amount = input.nextDouble();

        if((checkingBalance + Amount) >= 0){
            System.out.println("New Checking Account Balance : " + moneyFormat.format(calcCheckingDeposit(Amount)));
        } else {
            System.out.println("\n Balance can not be Negative \n");
        }
    }


    /*  GET SAVING DEPOSIT INPUT     */
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.println("\n Enter the amount you want to Deposit \n");

        double Amount = input.nextDouble();

        if((savingBalance + Amount) >= 0){
            System.out.println("\n New Saving Account Balance : " + moneyFormat.format(calcSavingDeposit(Amount)));
        } else {
            System.out.println("\n Balance can not be Negative \n");
        }
    }

}
