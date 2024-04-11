/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Executer {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.turnOn();
        remoteControl.play();
        remoteControl.pause();
        remoteControl.volumeDown();
        remoteControl.play();
        remoteControl.volumeUp();

    }
}
