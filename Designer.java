public class Designer extends Employees {

    private String designTool;
    private String createDesign;



    String getDesignTool(){
        return designTool;
    }
    void setDesignTool(String desognTool){
        this.designTool = desognTool;
    }


    String getCreateDesign(){
        return createDesign;
    }
    void setCreateDesign(String createDesign){
        this.createDesign = createDesign;
    }

    public Designer(String name, double salaryAmount, String designTool, String createDesign){
        super(name, salaryAmount);
        this.designTool = designTool;
        this.createDesign = createDesign;
    }

    public  void showDesignInfo(){
        System.out.println("------------------------------------");
        System.out.println("Name is: " + getName() + "\nSalary amount: " + getSalaryAmount());
        System.out.println("Tool is: " + designTool + "\nCreating is: " + createDesign);
    }




}
