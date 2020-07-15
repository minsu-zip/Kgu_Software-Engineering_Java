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
//		System.out.println("3은 소수입니다.!");
//	}
//	
//	//Test case 2,3
//	@Test
//	public void testPrime_false() {
//		assertFalse(checker.primeCheck(0));
//		System.out.println("0은 소수가 아닙니다.!");
//		assertFalse(checker.primeCheck(1000));
//		System.out.println("1000은 소수가 아닙니다.!");
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
//			System.out.println("문자입니다.!");
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
//			System.out.println("범위를 넘었습니다.!");
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
//			System.out.println("음수입니다.!");
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
//			System.out.println("입력값이 두 개 이상입니다.!");
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
//			 System.out.println("공백입니다.!");
//		}
//	}		
//	
	
	//Test case 9
	@Test
	public void alltest() {
		//count는 한줄에 표시될 소수갯수를 카운트하는 변수
		int count = 0;
		for(int i=0; i<=1000; i++) {
			if (checker.primeCheck(i)) {
				//콘솔에 10개씩 출력을 위한 if문
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