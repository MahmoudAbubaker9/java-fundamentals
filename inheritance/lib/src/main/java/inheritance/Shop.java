package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    String price;
    private int numOfRatingShop=0; // How many times has the restaurant been rated
    private double shopRate=0; // Total Rating for restaurant
    private ArrayList<Review> shopRating = new ArrayList<Review>();


    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public ArrayList<Review> getShopRating() {
        return shopRating;
    }

    public void setShopRating(ArrayList<Review> shopRating) {
        this.shopRating = shopRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String addReview(Review review){
        if (( review.getNumberOfStar() < 0) || (review.getNumberOfStar() > 5)){
            return("You can only review from 0 star to 5 star");
        }else {
            shopRating.add(review);
            numOfRatingShop++;
            shopRate = (( review.getNumberOfStar()+ shopRate )/ numOfRatingShop);
            this.shopRate =shopRate;
            return "new rating have been added for "+name+" the rate is "+ review.getNumberOfStar() ;
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", shopRate=" + shopRate +
                '}';
    }
}
