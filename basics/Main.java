import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Test");
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(4);
        clock();
    }

    public static String pluralize(String word, int numb) {
        return ((numb == 1) ? word : word + "s");
    }


    public static void flipNHeads(int n) {
        int counter = 0;
        int headsNumber = 0;
        while (headsNumber > n) {
            double random = Math.random();
            if (random < 0.5) {
                counter = counter +1 ;
                System.out.println("Tails");
            } else {
                headsNumber = headsNumber + 1;
                counter = counter + 1;
                System.out.println("Heads");
            }
        }
        String result = "It took " + counter + " flips to flip " + headsNumber + " head in a row.";
        System.out.println(result);

    }

    public static void clock () {
        LocalDateTime now = LocalDateTime.now();

        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            if (now.getSecond() != currentTime.getSecond()) {
                now = currentTime;
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                System.out.println(hour + ":" + minute + ":" + second);
            }
        }
    }

}