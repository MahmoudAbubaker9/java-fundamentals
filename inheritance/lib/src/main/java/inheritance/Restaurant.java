package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int numberOfStars; // How many stars did the reviewer give the restaurant
    private String price;
    private double numOfRating =0;  // How many times has the restaurant been rated
    private double rate=0; // Total Rating for restaurant
    private ArrayList<Review> ratingList = new ArrayList<>();

    public Restaurant(String name, int numberOfStars, String price) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return numberOfStars;
    }

    public void setStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;

    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRating() {
        return rate;
    }

    public void setRating(double rating) {
        this.rate = rating;
    }

    public void setNumOfRating(double numOfRating) {
        this.numOfRating = numOfRating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String addReview(Review review) {
        if (( review.getNumberOfStar() < 0) || (review.getNumberOfStar() > 5)){
            return("You can only review from 0 star to 5 star");
        }else {
            ratingList.add(review);
            numOfRating++;
            rate = (( review.getNumberOfStar()+ rate )/ numOfRating);
            this.rate =rate;
            return "new rating have been added for "+name+" the rate is "+ review.getNumberOfStar() ;
        }


    }

    public ArrayList<Review> getReviews() {
        return ratingList;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.ratingList = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + numberOfStars +
                ", price=" + price +
                ", reviews=" + ratingList +
                '}';
    }
}
