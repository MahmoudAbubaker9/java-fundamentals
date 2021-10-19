package inheritance;

import java.util.ArrayList;

public class Theater {

    private ArrayList<String> movieList = new ArrayList<String>();

    public Theater(String name, ArrayList<String> list) {
//        this.setName(name);
        this.movieList = list;
    }

    public void addMovie(String movie) {
        this.movieList.add(movie);
    }

    public void removeMovie(String movie) {
        this.movieList.remove(movie);
    }


}
