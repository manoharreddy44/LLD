package StructuralDesignPattern.FacadeDesignPattern;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player turned ON.");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}