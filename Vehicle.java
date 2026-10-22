public class Vehicle {
private String brand;
private int year;


    String getBrand(){
        return brand;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    int getYear(){
        return year;
    }
    void setYear(int year){
        this.year = year;
    }

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void showVehicleInfo(){
        System.out.println("---------------------------");
        System.out.println("Brand name is: " + brand + "\nYear: " + year);
    }
}
