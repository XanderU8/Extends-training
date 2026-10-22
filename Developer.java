import javax.swing.*;

public class Developer extends Employees {

private String prgLaunguage;
private String codeWriting;



    String getPrgLaunguage(){
        return prgLaunguage;
    }
    void setPrgLaunguage(String prgLaunguage){
        this.prgLaunguage = prgLaunguage;
    }
    String getCodeWriting(){
        return codeWriting;
    }
    void setCodeWriting(String codeWriting){
        this.codeWriting = codeWriting;
    }

    public Developer(String name, double salaryAmount, String prgLaunguage, String codeWriting){

        super(name, salaryAmount);
        this.prgLaunguage = prgLaunguage;
        this.codeWriting = codeWriting;
    }

    public  void showInfo2(){
        System.out.println("------------------------------------------------");
        System.out.println("Name is: " + getName() + "\nSalary amount is: " + getSalaryAmount());
        System.out.println("Programming language: " + prgLaunguage);
        System.out.println("Quallity code: " + codeWriting);
    }



}
