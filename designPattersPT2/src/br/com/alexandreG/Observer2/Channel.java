/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Observer2;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    String title;

    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        subscribers.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscriber sub : subscribers){
            sub.update();
        }
    }

    public void uploadVideo(String title){
        this.title = title;
        notifySubscribers();
    }
}
