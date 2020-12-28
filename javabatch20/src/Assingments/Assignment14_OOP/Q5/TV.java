package Assingments.Assignment14_OOP.Q5;

public class TV {
    /*
    Write a custom class TV that has 4 instance variables: int channel=1, int volumeLevel=1, boolean on = false,
    String brand = "undefined".
Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".
Also, create one more constructor that defines the instance variable brand, and displays the message:
"Creating TV object using 1 arg - constructor".
Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel),
channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.
Create isOn(), turnOn() and turnOff() methods for "on" instance variable. If the tv is already on,
no need to turn it on again, display the message: "TV is already ON".
If the tv is already off, then no need to turn it off again, display the message: "TV is already OFF".
The value of a variable channel cannot be negative or zero, and cannot be higher than 120.
If the user will try to set an invalid channel, display the message: "ERROR: TV is either OFF or invalid Channel".
Volume can be only in the range between 1 and 7. You may change volume only if TV is on.
Otherwise, display the message: "ERROR: TV is either OFF or invalid Volume level".
Create isOn() method that will check tv status.
     */
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public TV(int channel, int volumeLevel, boolean on, String brand) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
        this.brand = brand;
    }

    public void channelUp(){
        channel++;
        if(channel<=0 || channel>=120 ){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }
    public void channelDown(){
        channel--;
        if(channel<=0 || channel>=120 ){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void volumeUp(){
        volumeLevel++;
        if(on==false || volumeLevel<1 || volumeLevel>7){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public void volumeDown(){
        volumeLevel--;
        if(on==false || volumeLevel<1 || volumeLevel>7){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void isOn(boolean on){
        if(on=true){
            on=true;
        }else{
            on=false;
        }

    }
    public void isOff(){

        if(on==false){
            System.out.println("TV is already OFF");
        }
    }
    public void turnOn(){
        on=true;
        if(on){
            System.out.println("TV is already ON");
        }

    }

    //Setters and Getters
    public int getChannel() {
            return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;

    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
