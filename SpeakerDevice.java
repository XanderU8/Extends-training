public class SpeakerDevice extends SmartDevice {

private int volumeAmount;



    int getVolumeAmount(){
        return volumeAmount;
    }

    public void setVolumeAmount(int volumeAmount) {
        this.volumeAmount = volumeAmount;
    }

    public SpeakerDevice(String name, int priceItem, boolean isOn, int volumeAmount){
        super(name, priceItem, isOn);
        this.volumeAmount = volumeAmount;
    }

    public void showSpeakerInfo(){
        System.out.println("----------------------------------");
        System.out.println("Name Speaker is: " + getName() + "\nPrice item is: " + getPriceItem());

        if (getIsOn() == true){
            System.out.println("Speaker is: ON");
        }else{
            System.out.println("Speaker is: Off");
        }

        System.out.println("Volume amount is: " + volumeAmount);

    }




}
