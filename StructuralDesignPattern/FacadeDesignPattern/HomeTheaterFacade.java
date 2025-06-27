package StructuralDesignPattern.FacadeDesignPattern;

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;
    private Lights lights;
    private PopcornMaker popcorn;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound, Lights lights, PopcornMaker popcorn) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
        this.lights = lights;
        this.popcorn = popcorn;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready for movie night...");
        popcorn.start();
        lights.dim();
        projector.down();
        sound.on();
        dvd.on();
        dvd.play(movie);
    }
}
