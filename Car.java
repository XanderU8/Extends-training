public class Car extends Vehicle {
private int doorsAmount;


    int getDoorsAmount(){
        return doorsAmount;
    }
    void setDoorsAmount(int doorsAmount){
        this.doorsAmount = doorsAmount;
    }

    public Car (String brand, int year, int doorsAmount){
        super(brand, year);
        this.doorsAmount = doorsAmount;
    }

    public void showCarInfo(){
        System.out.println("-----------------------------------------");
        System.out.println("Brand name is: " + getBrand() + "\nYear: " + getYear());
        System.out.println("Doors amount: " + doorsAmount);
    }


}
