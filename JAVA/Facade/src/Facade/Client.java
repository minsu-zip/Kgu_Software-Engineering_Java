package Facade;

public class Client {
    public static void main(String[] args) {
        Facade homeTheaterFacade =
                new Facade(new Light(), new Projector(), new Screen(), new DvdPlayer());

        homeTheaterFacade.watchMovie("종이의집");
        homeTheaterFacade.endMovie();
    }
}
