/**
 * @author alexandre.gaia
 */
package br.com.alexandreG.Observer;

public interface Subject {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyAll(String title);
}
