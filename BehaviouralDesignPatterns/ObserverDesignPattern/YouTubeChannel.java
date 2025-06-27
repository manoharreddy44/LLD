package BehaviouralDesignPatterns.ObserverDesignPattern;


import java.util.*;

public class YouTubeChannel implements Channel{
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }


    public void uploadVideo(String title) {
        System.out.println("Channel uploaded: " + title);
        notifySubscribers(title);
    }
}
