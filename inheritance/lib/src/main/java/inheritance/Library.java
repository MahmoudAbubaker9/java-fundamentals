/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        Restaurant resReview1 = new Restaurant("Brisket", 4, "$$");
        Review review1 = new Review("its a good restuarant", "Ahmad", 4);
        resReview1.addReview(review1);

        Restaurant resReview2 = new Restaurant("Sufra", 5, "$$$$");
        Review review2 = new Review("its a good restuarant", "Mahmoud", 3);
        resReview2.addReview(review2);

        Restaurant resReview3 = new Restaurant("Cantaloupe", 2, "$$$$$");
        Review review3 = new Review("its a good restuarant", "abdallah", 4);
        resReview3.addReview(review3);

        Restaurant resReview4 = new Restaurant("Hashem", 3, "$");
        Review review4 = new Review("its a good restuarant", "lama", 2);
        resReview4.addReview(review4);

        Restaurant resReview5 = new Restaurant("KFC", 4, "$$");
        Review review5 = new Review("its a good restuarant", "mohammed", 1);
        resReview5.addReview(review5);

    }
}
