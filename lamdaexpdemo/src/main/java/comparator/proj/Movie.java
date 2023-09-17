package comparable.prog;

public class Movie implements Comparable<Movie>{
   private String movieName;
   private int rating;

    public Movie() {
    }

    public Movie(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", rating=" + rating +
                '}';
    }

    public int compareTo(Movie mov) {
        return this.rating - mov.rating;
    }


}
