package TemplateMethod;

public class study implements Template{

	public void init() {
		System.out.println("01. 공부할 책을 펼쳐 놓습니다.");
	}
	public void start() {
		System.out.println("02. 공부를 시작합니다.");
	}
	public void end() {
		System.out.println("03. 책을 정리합니다.");
	}
}
