/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Observer2;

public class Youtube {

    public static void main(String[] args){

        Channel cursoEmVideo = new Channel();
        Subscriber subscriber = new Subscriber("Alexandre");
        Subscriber subscriber_2 = new Subscriber("Marie");
        Subscriber subscriber_3 = new Subscriber("Julie");

        cursoEmVideo.subscribe(subscriber);
        cursoEmVideo.subscribe(subscriber_2);
        cursoEmVideo.subscribe(subscriber_3);


        //redundant
        subscriber.subscribeChannel(cursoEmVideo);
        subscriber_2.subscribeChannel(cursoEmVideo);
        subscriber_3.subscribeChannel(cursoEmVideo);

        cursoEmVideo.unsubscribe(subscriber_2);

        cursoEmVideo.uploadVideo("Generics em Java!");
    }
}
