package LAB02.JAVA2_2;

import java.util.ArrayList;

public class movieList {
    private ArrayList<String> movieList = new ArrayList();

    public void addMovieItem(String item){
        movieList.add(item);
    }
    public void printMovieList(){
        System.out.println("you have " + movieList.size() + " item in your Movie List");
        for (int i = 0; i < movieList.size(); i++){
            System.out.println((i + 1) + ". " + movieList.get(i));
        }
    }
    public void modifyMovieList(int position, String newItem){
        movieList.set(position, newItem);
            System.out.println("movie item " + (position + 1) + "has been modified");
        }
    public void removeMovieItem(int position){
        String theItem = movieList.get(position);
        movieList.remove(position);
        System.out.println("remove item " + theItem);
    }
    public String findItem(String searchItem){
        boolean exists = movieList.contains(searchItem);
        int position = movieList.indexOf(searchItem);
        if (position >= 0){
            return movieList.get(position);
        }
        return null;
    }
    public static void main(String[] args) {
        movieList list = new movieList();
        list.addMovieItem("break the silence");
        list.addMovieItem("bring the soul");
        list.addMovieItem("burn the stage");
        list.addMovieItem("hello");
        list.printMovieList();

        String search = list.findItem("break the silence");
        System.out.println(search);

        list.modifyMovieList(1, "break");
        list.printMovieList();
    }
}
