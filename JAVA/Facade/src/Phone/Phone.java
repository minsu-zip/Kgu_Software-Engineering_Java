package Phone;

public class Phone implements Template{

	public void on() {
		System.out.println("�޴����� ŵ�ϴ�.");
	}
	public void call() {
		System.out.println("��Ӵ����� ��ȭ�� �̴ϴ�.");
	}
	public void memo() {
		System.out.println("�޸� �մϴ�.");
	}
	public void off() {
		System.out.println("�޴����� ���ϴ�.");
	}
}
