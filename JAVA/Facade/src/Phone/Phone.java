package Phone;

public class Phone implements Template{

	public void on() {
		System.out.println("휴대폰을 킵니다.");
	}
	public void call() {
		System.out.println("어머니한테 전화를 겁니다.");
	}
	public void memo() {
		System.out.println("메모를 합니다.");
	}
	public void off() {
		System.out.println("휴대폰을 끕니다.");
	}
}
