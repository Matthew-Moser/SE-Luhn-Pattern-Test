package pt1;

public class LuhnPatternTest {
	static boolean checkCC(String CCNo) {
	
		int ccDigits = CCNo.length();
		int ccSum = 0;
		boolean isSecond = false;
		for (int i = ccDigits-1; i>=0; i--) {
		int n = CCNo.charAt(i) - '0';
		//every second digit in the string for CC length will multiply by two
		if (isSecond == true)
			n=n*2;
		
		ccSum += n /10;
		ccSum += n %10;
		isSecond = !isSecond;
		}
		return (ccSum % 10 == 0);
	}

	public static void main(String[] args) {
		String CCNo ="799273998713";
		if (checkCC(CCNo))
			System.out.println("This is a valid credit card");
		else 
			System.out.println("This is not a valid credit card, check your input and try again");

	}

}
