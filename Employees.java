public class Employees {
private String name;
private double salaryAmount;




        String getName(){
            return name;
        }
        void setName (String name){
            this.name = name;
        }
        double getSalaryAmount(){
            return salaryAmount;
        }
        void setSalaryAmount(double salaryAmount){
           this.salaryAmount = salaryAmount;
        }

        public Employees(String name, double salaryAmount){
            this.name = name;
            this.salaryAmount = salaryAmount;
        }

        public void showInfo(){
            System.out.println("-------------------------------");
            System.out.println("Name is: " + name);
            System.out.println("Salary amount: " + salaryAmount);
        }


}
