package Facade;

public class DvdPlayer {
    public void on() {
        System.out.println("DvdPlayer�� ŵ�ϴ�.");
    }

    public void play(String movieName) {
        System.out.println(movieName + "�� �����մϴ�.");
    }

    public void off() {
        System.out.println("DvcPlayer�� ���ϴ�.");
    }
}