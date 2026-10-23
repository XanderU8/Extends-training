public class BankAccount{

private String owner;
private double balanceAmount;
private double depositAmount;
private double withdrawAmount;


    String getOwner(){
        return owner;
    }
    void setOwner(String owner){
        this.owner = owner;
    }

    double getBalanceAmount(){
        return balanceAmount;
    }
    void setBalanceAmount(double balanceAmount){
        this.balanceAmount = balanceAmount;
    }

    double getDepositAmount(){
        return depositAmount;
    }
    void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }

    double getWithdrawAmount(){
        return withdrawAmount;
    }
    void setWithdrawAmount(double withdrawAmount){
        this.withdrawAmount = withdrawAmount;
    }

    public BankAccount(String owner, double balanceAmount, double depositAmount, double withdrawAmount){
        this.owner = owner;
        this.balanceAmount = balanceAmount;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public void showBankInfo(){
        System.out.println("-----------------------------------------");
        System.out.println("Owner name is: " + owner + "\nOwner balance is: " + balanceAmount);
        System.out.println("Last deposit amount is: +" + depositAmount + "$" + "\nLast withdraw amount is: -" + withdrawAmount + "$");
    }
}

