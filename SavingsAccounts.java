public class SavingsAccounts extends BankAccount {

private double interestRate;


    double getInterestRate(){
        return interestRate;
    }
    void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public SavingsAccounts(String owner, double balanceAmount, double depositAmount, double withdrawAmount, double interestRate){
        super(owner, balanceAmount, depositAmount, withdrawAmount);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalanceAmount() * interestRate;
        setBalanceAmount(getBalanceAmount() + interest);
    }


    public void applyDepositAmount(){
        double addMoney = getDepositAmount();
        setBalanceAmount(getBalanceAmount() + addMoney);
    }

    public void applyWithdrawAmount(){
        double removeMoney =  getWithdrawAmount();
        setBalanceAmount(getBalanceAmount() - removeMoney);
    }







    public void showSavingAccountInfo(){
        System.out.println("----------------------------------------");
        System.out.println("Owner name is: " + getOwner());
        System.out.println("Last deposit amount: +" + getDepositAmount() +"$" + "\nLast withdraw amount: -" + getWithdrawAmount() + "$");
        System.out.println("Interest rate is: " + interestRate + "\nThe total amount is: " + getBalanceAmount());

    }






}
