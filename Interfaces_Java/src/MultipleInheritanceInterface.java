/*9️.Multiple Interface Implementation
Create interface Vehicle with start().
Create interface MusicPlayer with playMusic().
Create class Car that implements both.*/

//interface Vehicle.
interface Vehicle1{
    //start method.
    void start();
}

//interface MusicPlayer.
interface MusicPlayer{
    //playMusic method.
    void playMusic();
}

//Car class implementing both interfaces.
class Car1 implements Vehicle1 , MusicPlayer{

    @Override
    public void start() {
        System.out.println("You can start car by phone.");
    }
    @Override
    public void playMusic() {
        System.out.println("You can any music in car.");
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {

        System.out.println("Car Features.");

        Car1 car1 = new Car1(); //Object creation.
        car1.start(); //Calling method.
        car1.playMusic(); //Calling method.

    }
}
