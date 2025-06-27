package BehaviouralDesignPatterns.ObserverDesignPattern;

import java.util.concurrent.Flow;

public class EmailSubscriber implements Subscriber {
    private String name;


    public EmailSubscriber(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println("Hey " + name + ", new video uploaded: " + videoTitle);
    }

}
