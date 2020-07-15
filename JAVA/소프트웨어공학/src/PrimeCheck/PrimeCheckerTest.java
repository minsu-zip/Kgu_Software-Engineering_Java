package PrimeCheck;

import static org.junit.Assert.*;
import org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {
	PrimeChecker checker = new PrimeChecker();
	
	//Test case 1
//	@Test
//	public void testPrime_true() {
//		assertTrue(checker.primeCheck(3));
//		
//		System.out.println("3�� �Ҽ��Դϴ�.!");
//	}
//	
//	//Test case 2,3
//	@Test
//	public void testPrime_false() {
//		assertFalse(checker.primeCheck(0));
//		System.out.println("0�� �Ҽ��� �ƴմϴ�.!");
//		assertFalse(checker.primeCheck(1000));
//		System.out.println("1000�� �Ҽ��� �ƴմϴ�.!");
//	}
//	
//	//Test case 7
//	@Test
//	public void testPrime_checkArgs_chr_input() {
//		try {
//			String[] args = new String[1];
//			args[0] = "r";
//			checker.checkArgs(args);
//			fail("Should raise an Exception");
//		}
//		catch(Exception success) {
//			System.out.println("�����Դϴ�.!");
//		}
//	}
//	
//	//Test case 5
//	@Test
//	public void testPrime_checkArgs_above_upper_bound() {
//		try {
//			String[] args = new String[1];
//			args[0] = "1001";
//			checker.checkArgs(args);
//			fail("Should raise an Exception");
//		}
//		catch(Exception success) {
//			//sucessful test
//			System.out.println("������ �Ѿ����ϴ�.!");
//		}
//	}
//	
//	//Test case 5
//	@Test
//	public void testPrime_checkArgs_neg_input() {
//		try {
//			String[] args = new String[1];
//			args[0] = "-1";
//			checker.checkArgs(args);
//			fail("Should raise an Exception");
//		}
//		catch(Exception success) {
//			//sucessful test
//			System.out.println("�����Դϴ�.!");
//		}
//	}
//	
//	//Test case 6
//	@Test
//	public void testPrime_checkArgs_2_inputs() {
//		try {
//			String[] args = new String[2];
//			args[0] = "2";
//			args[0] = "77";
//			checker.checkArgs(args);
//			fail("Should raise an Exception");
//		}
//		catch(Exception success) {
//			//sucessful test
//			System.out.println("�Է°��� �� �� �̻��Դϴ�.!");
//		}
//	}	
//	
//	//Test case 8
//	@Test
//	public void testPrime_checkArgs_0_inputs() {
//		try {
//			String[] args = new String[0];
//			checker.checkArgs(args);
//			fail("Should raise an Exception");
//		}
//		catch(Exception success) {
//			 System.out.println("�����Դϴ�.!");
//		}
//	}		
//	
	
	//Test case 9
	@Test
	public void alltest() {
		//count�� ���ٿ� ǥ�õ� �Ҽ������� ī��Ʈ�ϴ� ����
		int count = 0;
		for(int i=0; i<=1000; i++) {
			if (checker.primeCheck(i)) {
				//�ֿܼ� 10���� ����� ���� if��
				if(count == 10) {
					count = 0;
					System.out.println();
				}
				count++;
				System.out.print(i+"\t");
			}
		}
	}
}