package Facade;

public class DvdPlayer {
    public void on() {
        System.out.println("DvdPlayer를 킵니다.");
    }

    public void play(String movieName) {
        System.out.println(movieName + "를 시작합니다.");
    }

    public void off() {
        System.out.println("DvcPlayer를 끕니다.");
    }
}