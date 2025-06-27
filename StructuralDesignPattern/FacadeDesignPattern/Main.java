package StructuralDesignPattern.FacadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Create subsystem objects
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();
        PopcornMaker popcorn = new PopcornMaker();

        // Create the facade
        HomeTheaterFacade theater = new HomeTheaterFacade(dvd, projector, sound, lights, popcorn);

        // Use the facade
        theater.watchMovie("Avengers: Endgame");
    }
}

