/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class RemoteControl implements IController{
    //attributes
    private int volume;
    private boolean on;
    private boolean playing;

    //remote control constructor
    public RemoteControl(){
        this.volume = 50;
        this.on = true;
        this.playing = false;
    }

    //attribute's getters n setters from
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private boolean getPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    //interface methods implementations
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {

        if(this.getOn()){
            System.out.println(" #### Opening Menu ###");
            System.out.println("Is it on? " + this.getOn());
            System.out.println("Is it playing? " + this.getPlaying());
            System.out.println("Volume: " + this.getVolume());
            for(int i = 0; i <= this.getVolume(); i+=5){
                System.out.println("|");
            }
        }else{
            System.out.println("The TV must be ON in order to perform any action.");
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing menu..");
    }

    @Override
    public void volumeUp() {
        if(this.getOn()){
            this.setVolume(this.getVolume() +5);
            System.out.println("Increasing volume.");
        }else{
            System.out.println("Increasing volume isn't possible.");
        }
    }

    @Override
    public void volumeDown() {
        if(!this.getOn()){
            this.setVolume(this.getVolume() -5);
            System.out.println("Decreasing volume.");
        }else{
            System.out.println("Decreasing volume isn't possible.");
        }
    }

    @Override
    public void muteOn() {
        if(this.getOn() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Muted.");
        }
    }

    @Override
    public void muteOff() {
        if(this.getOn() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Unmuted.");
        }
    }

    @Override
    public void play() {
        if(this.getOn() && !(this.getPlaying())){
            this.setPlaying(true);
            System.out.println("Playing.");
        }else{
            System.out.println("The TV must be on in order to play.");
        }
    }

    @Override
    public void pause() {
        if(this.getOn() && (this.getPlaying())){
            this.setPlaying(false);
            System.out.println("Paused.");
        }
    }
}
