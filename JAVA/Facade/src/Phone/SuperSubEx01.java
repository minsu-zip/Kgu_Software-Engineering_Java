package Phone;

class A {
	String aField = "Ŭ���� A �ʵ�";
	public void aMethod() {
		System.out.println(aField);
		// System.out.println("A : "+ bField); // ������ ����(�ڽ� �ʵ� ��� �Ұ�)
	}
}

class B extends A {
	String bField = "Ŭ���� B �ʵ�";
	public void bMethod() {
		System.out.println(aField); // �θ� Ŭ���� �ʵ� ���
		System.out.println(bField); // ���� Ŭ���� �ʵ� ���
		// System.out.println("B : "+cField); // ������ ����(�ڽ� �ʵ� ��� �Ұ�)
	}
}

class C extends B {
	String cField = "Ŭ���� C �ʵ�";
	public void cMethod() {
		System.out.println(aField); // ���θ� Ŭ���� �ʵ� ���
		System.out.println(bField); // �θ� Ŭ���� �ʵ� ���
		System.out.println(cField); // ���� Ŭ���� �ʵ� ���
	}
}

public class SuperSubEx01 {
	public static void main(String[] args) {
		System.out.println("----------A----------");
		A a = new A();
		a.aMethod(); // ���� �޼ҵ� ���
		// a.bMethod(); // A(�θ�) ��ü�� B(�ڽ�) �޼ҵ� ���� �Ұ�
		System.out.println("----------A----------");
		System.out.println("----------B----------");
		B b = new B();
		b.aMethod(); // �θ� �޼ҵ� ���
		b.bMethod(); // ���� �޼ҵ� ���
		// b.cMethod(); // B(�θ�) ��ü�� C(�ڽ�) �޼ҵ� ���� �Ұ�
		System.out.println("----------B----------");
		System.out.println("----------C----------");
		C c = new C();
		c.aMethod(); // ���θ� �޼ҵ� ���
		c.bMethod(); // �θ� �޼ҵ� ���
		c.cMethod(); // ���� �޼ҵ� ���
		System.out.println("----------C----------");
	}
}
