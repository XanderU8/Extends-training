public class SmartLight extends SmartDevice {


    private int brightness;


    int getBrightness(){
        return brightness;
    }
    void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public SmartLight(String name, int priceItem, boolean isOn, int brightness){
        super(name, priceItem, isOn);
        this.brightness = brightness;
    }


    public void showStatusLight(){
        System.out.println("--------------------------");

        System.out.println("Name device is: " + getName() +  "\nPrice Item is: " + getPriceItem());

        if (getIsOn() == true){
            System.out.println("Device is: ON");
        }else{
            System.out.println("Device is: Off");
        }


        System.out.println("Light value :" + brightness);
    }
}
