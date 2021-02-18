public class Television {

    /** The purpose of this class ios to model a television
     * Leonardo N Oliveira, 02/17/2020
     */
    private String MANUFACTURER;

    private int SCREEN_SIZE;
    private int channel;
    private int volume;

    private boolean powerOn;

    // Class constructor - The purpose is to initialize parameters
    public Television(){

        powerOn = false;
        volume = 20;
        channel = 2;

    }

    public Television(String MANUFACTURER, int SCREEN_SIZE) {

        MANUFACTURER = "SONY";
        SCREEN_SIZE = 56;

    }


    public static void main (String[] args){


}



    public String Television2(String brand, int size) {

        return brand;

    }

    public void setChannel(int station) {


    }

    public void power(){}

    public void increaseVolume(){}

    public void decreaseVolume(){}

    public int getChannel() {

        return getChannel();
    }

    public int getVolume(){

        return getVolume();
    }

    public String getManufacturer(){

        return getManufacturer();
    }

    public int getScreenSize(){

        return getScreenSize();
    }


    public int setChannel(){

      channel= channel + 10;

return channel;
    }



}
