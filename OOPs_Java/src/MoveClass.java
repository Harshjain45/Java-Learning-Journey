//14.Create class Movie with title, rating, and duration. Write method display().
public class MoveClass {
    //Movie class.
    static class Movie{
        String title;
        float rating;
        float duration;
        //Display method.
        public void display(){
            System.out.println("Movie Title = " + title + ".");
            System.out.println("Movie Rating = " + rating + "/10 IMDb");
            System.out.println("Movie Duration = " + duration + " Hours.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Movie Class:");
        Movie movie = new Movie();//Instantiation new movie class.
        //Setting attributes.
        movie.title = "Interstellar";
        movie.rating = 8.7f;
        movie.duration = 2.45f;
        //Calling method.
        movie.display();
    }
}
