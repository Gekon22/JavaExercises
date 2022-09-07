package trainings.polymorhism.movies;

public class MovieDocumentary implements Movie{
    @Override
    public void play() {
        System.out.println("Start documentary");
    }

    @Override
    public void stop() {
        System.out.println("Stop documentary");

    }
}
