package BehaviouralDesignPatterns.ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();


        Subscriber user1 = new EmailSubscriber("Alice");
        Subscriber user2 = new EmailSubscriber("Bob");
        Subscriber user3 = new EmailSubscriber("Charlie");


        channel.subscribe(user1);
        channel.subscribe(user2);


        channel.uploadVideo("Observer Design Pattern in Java");

        channel.unsubscribe(user1);
        channel.subscribe(user3);

        channel.uploadVideo("Factory vs Builder Design Pattern");

    }
}
