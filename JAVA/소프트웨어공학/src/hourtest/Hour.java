package hourtest;

import java.util.Scanner;

public class Hour {
	public int pay(int hour, int wage) {
			
		if(hour <=0 || hour > 80 || wage <= 0 || wage > 10000) {
			return 0;
		}
		
		if(hour >=40) {
			return (int) ((hour * wage) + ((hour - 40) * wage * 0.5));
		}
		else
			return (int) (hour * wage);
	}
	
	public static void main(String[] args) {
		// main������ �׽�Ʈ�� �� �̿�
//		Scanner sc = new Scanner(System.in);
//		Hour test = new Hour();
//		int hour,wage = 0;
//		
//		System.out.print("���� �ð��� �Է��Ͻÿ�: ");
//		hour = sc.nextInt();
//		System.out.print("�ñ���  �Է��Ͻÿ�: ");
//		wage = sc.nextInt();
//		System.out.println("�޿�: " + test.pay(hour, wage));

	}

}
