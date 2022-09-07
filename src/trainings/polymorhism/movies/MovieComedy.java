package trainings.polymorhism.movies;

public class MovieComedy implements Movie{
    @Override
    public void play() {
        System.out.println("Play comedy");
    }

    @Override
    public void stop() {
        System.out.println("Stop comedy");

    }
}
