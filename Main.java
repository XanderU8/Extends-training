import java.time.Year;

class Main{
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Mercedes", 2010);

        Car car1 = new Car("BMW", 2015, 4);
        Car car2 = new Car("Audi", 2018, 2);

        Motorcycle motorcycle1 = new Motorcycle("Susuki", 2020, false);

        vehicle1.showVehicleInfo();

        car1.showCarInfo();
        car2.showCarInfo();

        motorcycle1.showMotorcycleInfo();
    }
}