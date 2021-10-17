package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int numberOfStars;
    private String price;
    private double numOfRating=0;
    private double rate=0;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String addReview(Review review) {
        if (review.getNumberOfStars()>5){
            return("You can only review from 1 star to 5 star");
        }
        else {
            Review newReview = new Review(review.getBody(), review.getAuthor(), review.getNumberOfStars());
            ratingList.add(newReview);
            numOfRating++;
            rate = (review.getNumberOfStars() + rate) / numOfRating;
            return "new rating have been added for"+name;
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
