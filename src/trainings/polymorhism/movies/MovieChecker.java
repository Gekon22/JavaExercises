package trainings.polymorhism.movies;

import trainings.static_.SomeClass;

public class MovieChecker {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();

        Movie movie = getMovie("comedy");
        movie.play();
        movie.stop();
    }
    public static Movie getMovie(String name){
        if(name.equals("documentary")){
            return new MovieDocumentary();
        }
            else if (name.equals("comedy")) {
            return new MovieComedy();
        }
            return null;

        }
    }

