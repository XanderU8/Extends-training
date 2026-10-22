import javax.sql.rowset.serial.SerialStruct;

public class SmartDevice {

private  String name;
private int priceItem;
private boolean isOn;



    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }
    int getPriceItem(){
        return priceItem;
    }
    void setPriceItem(int priceItem){
        this.priceItem = priceItem;
    }

    boolean getIsOn(){
        return isOn;
    }
    void setOn(boolean isOn){
        this.isOn = isOn;
    }
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public SmartDevice(String name, int priceItem, boolean isOn){
        this.name = name;
        this.priceItem = priceItem;
        this.isOn = isOn;
    }

    public void showStatusDeviceInfo(){
        System.out.println("------------------------------");
        System.out.println("Device name: " + name);
        System.out.println("Price Item is: " + priceItem);

        if(isOn = true){
            System.out.println("Status: ON");
        }else if(isOn = false){
            System.out.println("Status: off");
        }

    }



}
