import java.util.Scanner;

public class Television {

    /** The purpose of this class ios to model a television
     * Leonardo Oliveira, 02/17/2020
     */
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private int channel;
    private int volume;
    private boolean powerOn;

    // Class constructor - The purpose is to initialize parameters
    Television(String brand, int size){

        MANUFACTURER = brand;
        SCREEN_SIZE = size;

        volume = 20;
        channel = 2;
        powerOn = false;

    }


// This method receives information from TelevisionDemo bigScreen.setChannel(station);
    public void setChannel(int station) {

        channel = station;

    }

    // Power on and power off the TV.
    public void power(){

        if (powerOn != powerOn) {

            powerOn = false;

        }
        else
            powerOn = true;


    }

    // Method to increase volume by 1
    public void increaseVolume(){

        if (volume <100) {
            volume++;

            }

    }

    // Method to decrease volume by 1
    public void decreaseVolume(){

        if (volume >0){
            volume--;

        }

    }


    // Method to get channel
    public int getChannel() {

        //new var calling another var from the constructor
        int getChannelReturn = channel;

            return getChannelReturn;
    }

    // Method to get volume.
    public int getVolume(){

        //new var calling another var from the constructor
        int getVolumeReturn = volume;

            return getVolumeReturn;
    }


    // Method to get Manufacturer.
    public String getManufacturer(){

        //new var calling another var from the constructor
        String BRAND = MANUFACTURER;

            return BRAND;
    }

    // Method to get screen size.
    public int getScreenSize(){

        //new var calling another var from the constructor
        int SIZE = SCREEN_SIZE;

            return SIZE;
    }



}
