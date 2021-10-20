package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStar;

    public Review(String body, String author, int numberOfStarsFromAuthor) {
        this.body = body;
        this.author = author;
        this.numberOfStar = numberOfStarsFromAuthor;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfStar() {
        return numberOfStar;
    }

    public void setNumberOfStar(int numberOfStar) {
        this.numberOfStar = numberOfStar;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStar +
                '}';
    }

}
