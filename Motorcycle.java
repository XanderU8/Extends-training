public class Motorcycle extends Vehicle {
    private boolean hasSideCar;


    boolean getHasSideCar() {
        return hasSideCar;
    }

    void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public void hasSideCar() {
        hasSideCar = true;
    }

    public void hasNoSideCar() {
        hasSideCar = false;
    }

    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = getHasSideCar();
    }

    public void showMotorcycleInfo() {
        System.out.println("-------------------------------------------");
        System.out.println("Brand name is: " + getBrand() + "\nYear: " + getYear());

        if (hasSideCar == true){
            System.out.println("Motorcycle has car side!");
        } else {
                System.out.println("Motorcycle has  NO car side");
            }
        }
    }
