/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Observer;

import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject{

    private String news_title;

    @Override
    public String toString() {
        return "Journalist{" +
                "news_title='" + news_title + '\'' +
                '}';
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String title) {
        this.news_title = title;
        for(Observer ob : this.observers){
            ob.update(this);
        }
    }
}
