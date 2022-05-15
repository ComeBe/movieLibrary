import Tools.Menu;
import Tools.UserInputHandler;
import models.Actor;
import models.MovieLibrary;

public class MovieLibraryApp {
    public static void main(String[] args) {
        MovieLibrary movielibrary = new MovieLibrary();
        movielibrary.fillMovieList();

        while (true){
            Menu.printMenu();

        switch (UserInputHandler.getMenuOptionFromUser()) {
            case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                movielibrary.getRandomMovieInformation();
                break;
            case DISPLAYACTORS:
                movielibrary.printActorFilmography();
                break;
            case QUIT: //Exit
                System.out.printf("Bye");
                System.exit(1);

        }
        }
    }


}
