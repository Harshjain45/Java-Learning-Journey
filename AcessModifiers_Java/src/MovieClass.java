/*12. Create a class Movie with title, year, rating.
Constructor initializes all
Method showMovieInfo().*/
public class MovieClass {
    //Movie class.
    static class Movie {
        String title;
        int year;
        float rating;
        //Constructor.
        Movie(String title, int year, float rating) {
            this.title = title;
            this.year = year;
            this.rating = rating;
        }
        //showMovieInfo method.
        public void showMovieInfo() {
            System.out.println("Title of movie : " + title);
            System.out.println("Year of release : " + year);
            System.out.println("Rating : " + rating + "/10 IMDb");
        }
    }
    public static void main(String[] args) {
        Movie movie = new Movie("Interstellar", 2014, 8.7f);
        movie.showMovieInfo();//Printing details.
    }
}