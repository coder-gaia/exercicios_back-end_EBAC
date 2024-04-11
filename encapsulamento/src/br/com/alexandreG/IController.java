/**
 * @author alexandre.gaia
 */
package br.com.alexandreG;

interface IController {

    //the Interface contains only the methods. It cannot be instanced.

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void openMenu();
    public abstract void closeMenu();
    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract void muteOn();
    public abstract void muteOff();
    public abstract void play();
    public abstract void pause();
}
