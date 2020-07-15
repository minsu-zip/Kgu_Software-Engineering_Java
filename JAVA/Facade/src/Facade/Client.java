package Facade;

public class Client {
    public static void main(String[] args) {
        Facade homeTheaterFacade =
                new Facade(new Light(), new Projector(), new Screen(), new DvdPlayer());

        homeTheaterFacade.watchMovie("��������");
        homeTheaterFacade.endMovie();
    }
}
