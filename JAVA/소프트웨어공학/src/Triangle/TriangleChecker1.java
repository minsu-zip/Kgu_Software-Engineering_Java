package Triangle;

public class TriangleChecker1 {

	public String check(final int a, final int b, final int c) {
		int match;
		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			return "INVALID";
		}
		match = 0;
		if (a == b) {
			match = match + 1;
		}
		if (a == c) {
			match = match + 2;
		}
		if (b == c) {
			match = match + 3;
		}
		if (match == 0) {
			if (((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
				return "INVALID";
			} else {
				return "SCALENE";
			}
		}
		if (match > 3) {
			return "EQUILATERAL";
		}
		if ((match == 1) && ((a + b) > c)) {
			return "ISOSCELES";
		} else if ((match == 2) && ((a + c) > b)) {
			return "ISOSCELES";
		} else if ((match == 3) && ((b + c) > a)) {
			return "ISOSCELES";
		}
		return "INVALID";
	}

	public static void main(String[] args) {
		String type = "";
		TriangleChecker1 tester = new TriangleChecker1();

		type = tester.check(1,2,3);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(2,1,3);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(3,2,1);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(1,3,2);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(3,1,2);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(2,3,1);
		System.out.println("삼각형 유형은 : " + type);
	}
}