class Main{
    public static void main(String[] args) {

        SmartDevice device1 = new SmartDevice("Iphone",1200,true);
        SmartDevice device2 = new SmartDevice("Android",800,false);

        SmartLight lightDevice1 = new SmartLight("Lamp", 25,false,3);
        SmartLight lightDevice2 = new SmartLight("Second Lamp",30, true, 5);

        SpeakerDevice speakerDevice1 = new SpeakerDevice("JBL", 200,true, 85);
        SpeakerDevice speakerDevice2 = new SpeakerDevice("Sony", 500,false, 50);


        device1.showStatusDeviceInfo();
        device2.showStatusDeviceInfo();

        lightDevice1.showStatusLight();
        lightDevice2.showStatusLight();

        speakerDevice1.showSpeakerInfo();
        speakerDevice2.showSpeakerInfo();
    }
}