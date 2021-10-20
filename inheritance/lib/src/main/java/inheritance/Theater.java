package inheritance;

import java.util.ArrayList;

public class Theater {

    String name;
    private int numOfRatingTheater=0; // How many times has the restaurant been rated
    private double theaterRate=0; // Total Rating for restaurant
    private ArrayList<String> moviesList = new ArrayList<>();
    private ArrayList<Review> theatreRate = new ArrayList<Review>();

    public Theater(String name, ArrayList<String> moviesList) {
        this.name =name;
        this.moviesList = moviesList;
    }

    public ArrayList<String> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(ArrayList<String> moviesList) {
        this.moviesList = moviesList;
    }

    public ArrayList<Review> getTheatreRate() {
        return theatreRate;
    }

    public void setTheatreRate(ArrayList<Review> theatreRate) {
        this.theatreRate = theatreRate;
    }

    public String addMovie(String movie) {
        if (moviesList.contains(movie)){
            return " The movie already in your list";
        }else {
        this.moviesList.add(movie);
        return " The movie "+movie+" added to your list";
    }
    }

    public String removeMovie(String movie) {
        this.moviesList.remove(movie);
        return " The movie "+movie+" removed from your list";
    }

    public String addReview(Review review){
        if (( review.getNumberOfStar() < 0) || (review.getNumberOfStar() > 5)){
            return("You can only review from 0 star to 5 star");
        }else {
            theatreRate.add(review);
            numOfRatingTheater++;
            theaterRate = (( review.getNumberOfStar()+ theaterRate )/ numOfRatingTheater);
            this.theaterRate =theaterRate;
            return "new rating have been added for "+name+" the rate is "+ review.getNumberOfStar() ;
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", theaterRate=" + theaterRate +
                ", moviesList=" + moviesList +
                '}';
    }
}
