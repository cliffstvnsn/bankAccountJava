public class BankAccount{

    //attributes
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts = 0; 
    private static double totalAmount = 0;

    //constructor
    public BankAccount(double checkingBalanceParam, double savingsBalanceParam){
        checkingBalance = checkingBalanceParam;
        savingsBalance = savingsBalanceParam;
        numOfAccounts++;
        totalAmount += checkingBalanceParam + savingsBalanceParam;
    }

    //methods
    public double seeTotalBalance(){
        double output = this.checkingBalance + this.savingsBalance;
        return output;
    }

    public void addDepositChecking(double depositAmount){
        this.checkingBalance += depositAmount;
        totalAmount += depositAmount;
    }

    public void addDepositSavings(double depositAmount){
        this.savingsBalance += depositAmount;
        totalAmount += depositAmount;
    }

    public void withdrawChecking(double withdrawAmount){
        double cb = this.checkingBalance;
        double remainder = this.checkingBalance - withdrawAmount;
        if (remainder <= 0) {
            System.out.println("Not enough money for withdrawal");
        }
        else {
            this.checkingBalance -= withdrawAmount;
            totalAmount -= withdrawAmount;
        }
    }

    public void withdrawSavings(double withdrawAmount){
        this.savingsBalance -= withdrawAmount;
        totalAmount -= withdrawAmount;
    }

    //getter for checkingBalance
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    //setter for checkingBalance
    public void setCheckingBalance(){
        this.checkingBalance = checkingBalance;
    }

    //getter for savingBalance
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    //setter for savingBalance
    public void setSavingsBalance(){
        this.savingsBalance = savingsBalance;
    }

    //getter for numOfAccounts
    public static int getNumOfAccounts(){
        return numOfAccounts;
    }

    //setter for numOfAccounts
    public void setNumOfAccounts(){
        numOfAccounts = numOfAccounts;
    }

    //getter for totalAmount
    public static double getTotalAmount(){
        return totalAmount;
    }

    //setter for totalAmount
    public void setTotalAmount(){
        totalAmount = totalAmount;
    }
}