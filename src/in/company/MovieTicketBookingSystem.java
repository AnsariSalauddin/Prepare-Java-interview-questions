package in.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Movie class
class Movie {
    private String title;
    private String genre;
    private int duration;
    private List<String> showtimes;

    public Movie(String title, String genre, int duration, List<String> showtimes) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showtimes = showtimes;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public List<String> getShowtimes() {
        return showtimes;
    }

    public void displayDetails() {
        System.out.println("🎬 " + title + " | Genre: " + genre + " | Duration: " + duration + " minutes");
    }

    public void displayShowtimes() {
        System.out.println("Showtimes for " + title + ":");
        for (int i = 0; i < showtimes.size(); i++) {
            System.out.println((i + 1) + ". " + showtimes.get(i));
        }
    }
}

// MovieTheater class
class MovieTheater {
    private List<Movie> movies;
    private static final int TICKET_PRICE = 10;

    public MovieTheater() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void displayAllMovies() {
        System.out.println("\n🎥 Available Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.print((i + 1) + ". ");
            movies.get(i).displayDetails();
        }
    }

    public Movie selectMovie(int index) {
        return movies.get(index - 1);
    }

    public void bookTickets(Movie movie, int showtimeIndex, int numberOfTickets) {
        String selectedShowtime = movie.getShowtimes().get(showtimeIndex - 1);
        int totalCost = numberOfTickets * TICKET_PRICE;

        System.out.println("\n✅ Booking Confirmed!");
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Showtime: " + selectedShowtime);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Cost: $" + totalCost);
    }
}

// Main class
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create showtimes
        List<String> showtimes1 = List.of("10:00 AM", "1:00 PM", "4:00 PM");
        List<String> showtimes2 = List.of("11:30 AM", "3:00 PM", "6:30 PM");

        // Create movies
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148, showtimes1);
        Movie movie2 = new Movie("The Dark Knight", "Action", 152, showtimes2);

        // Create theater and add movies
        MovieTheater theater = new MovieTheater();
        theater.addMovie(movie1);
        theater.addMovie(movie2);

        // Display movies
        theater.displayAllMovies();

        // Select movie
        System.out.print("\nEnter the movie number to book: ");
        int movieChoice = scanner.nextInt();
        Movie selectedMovie = theater.selectMovie(movieChoice);

        // Show showtimes
        selectedMovie.displayShowtimes();

        // Select showtime
        System.out.print("\nEnter the showtime number to book: ");
        int showtimeChoice = scanner.nextInt();

        // Fixed number of tickets (3 as per requirement)
        int numberOfTickets = 3;

        // Book tickets
        theater.bookTickets(selectedMovie, showtimeChoice, numberOfTickets);
    }
}

