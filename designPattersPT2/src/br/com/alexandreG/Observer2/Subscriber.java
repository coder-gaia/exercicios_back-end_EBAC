/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Observer2;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name){
        this.name = name;
    }

    public void update(){
        System.out.println("Hey, " + name + "! A new video has been uploaded: " + channel.title );
    }

    public void add(Subscriber sub) {
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
