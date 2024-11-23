import Observer.User;
import Subject.MoviePlatform;
import java.util.Scanner;

public class DesiFlix {
    public static void main(String[] args) {
        MoviePlatform moviePlatform = new MoviePlatform();
        moviePlatform.addGenre("Thriller");
        moviePlatform.addGenre("Horror");
        moviePlatform.addGenre("Comedy");

        User user1 = new User("Gourove");
        User user2 = new User("Dip");
        User user3 = new User("Turjo");

        user1.addFavoriteGenre("Comedy");
        user2.addFavoriteGenre("Comedy");
        user2.addFavoriteGenre("Thriller");
        user3.addFavoriteGenre("Horror");

        moviePlatform.addObserver(user1);
        moviePlatform.addObserver(user2);
        moviePlatform.addObserver(user3);

        moviePlatform.uploadMovie("The Hangover", "Comedy");
        moviePlatform.uploadMovie("The Conjuring", "Horror");
        moviePlatform.uploadMovie("The Dark Knight", "Thriller");

        moviePlatform.removeGenre("Comedy");
        moviePlatform.uploadMovie("PK", "Comedy");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a command (upload/remove/exit): ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("exit")) {
            break;
            }
            switch (command.toLowerCase()) {
            case "upload":
                System.out.println("Enter movie name: ");
                String movieName = scanner.nextLine();
                System.out.println("Enter genre: ");
                String genre = scanner.nextLine();
                moviePlatform.uploadMovie(movieName, genre);
                break;
            case "remove":
                System.out.println("Enter genre to remove: ");
                String genreToRemove = scanner.nextLine();
                moviePlatform.removeGenre(genreToRemove);
                break;
            default:
                System.out.println("Invalid command.");
            }
        }
        scanner.close();

        moviePlatform.close();
    }
}
