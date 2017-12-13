
public class Logic1 {

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend == true && cigars >= 40)
			return true;
		else if (isWeekend == false && cigars >= 40 && cigars <= 60)
			return true;
		else
			return false;
	}

	public int dateFashion(int you, int date) {
		int result;
		if (you <= 2 || date <= 2)
			result = 0;
		else if (you >= 8 || date >= 8)
			result = 2;
		else
			result = 1;
		return result;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer == true && temp >= 60 && temp <= 100) {
			return true;
		} else if (isSummer == false && temp >= 60 && temp <= 90) {
			return true;
		} else
			return false;
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int result = 0;
		if ((isBirthday == false && speed <= 60) || (isBirthday == true && speed <= 65))
			result = 0;
		else if ((isBirthday == false && speed > 60 && speed <= 80)
				|| (isBirthday == true && speed > 65 && speed <= 85))
			result = 1;
		else if ((isBirthday == false && speed > 80) || (isBirthday == true && speed > 85))
			result = 2;
		return result;
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum >= 10 && sum <= 19)
			sum = 20;
		return sum;
	}

	public String alarmClock(int day, boolean vacation) {
		if ((day >= 1 && day <= 5) && vacation == false)
			return "7:00";
		else if ((day == 0 || day == 6) && vacation == true)
			return "off";
		else
			return "10:00";

	}

	public boolean love6(int a, int b) {
		if (a == 6 || b == 6)
			return true;
		else if (a + b == Math.abs(6) || a - b == Math.abs(6) || b - a == Math.abs(6))
			return true;
		return false;
	}

	public boolean in1To10(int n, boolean outsideMode) {
		if ((n >= 1 && n <= 10) && outsideMode == false)
			return true;
		else if ((n <= 1 || n >= 10) && outsideMode == true)
			return true;
		return false;
	}

	public boolean specialEleven(int n) {
		if (n % 11 == 0 || (n % 11) == 1)
			return true;
		return false;
	}

	public boolean more20(int n) {
		if ((n % 20 == 1) || (n % 20 == 2))
			return true;
		return false;
	}

	public boolean old35(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return false;
		else if (n % 3 == 0 || n % 5 == 0)
			return true;
		else
			return false;
	}

	public boolean less20(int n) {
		if (((n + 1) % 20 == 0) || ((n + 2) % 20 == 0))
			return true;
		return false;
	}

	public boolean nearTen(int num) {
		if ((num % 10 < 3) || (num % 10 >= 8))
			return true;
		return false;
	}

	public int teenSum(int a, int b) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
			return 19;
		return a + b;
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep)
			return false;
		else if ((isMorning && isMom) || !isMorning)
			return true;
		else
			return false;

	}

	public int teaParty(int tea, int candy) {
		if ((tea >= 5 && candy >= 5) && ((tea >= 2 * candy) || (candy >= 2 * tea)))
			return 2;
		else if (tea >= 5 && candy >= 5)
			return 1;
		return 0;
	}

	public String fizzString(String str) {
		if ((str.charAt(0) == 'f') && (str.charAt(str.length() - 1) == 'b'))
			return "FizzBuzz";
		else if (str.charAt(0) == 'f')
			return "Fizz";
		else if (str.charAt(str.length() - 1) == 'b')
			return "Buzz";
		else
			return str;
	}

	public String fizzString2(int n) {
		if ((n % 3 == 0) && (n % 5 == 0))
			return "FizzBuzz!";
		else if (n % 3 == 0)
			return "Fizz!";
		else if (n % 5 == 0)
			return "Buzz!";
		else
			return n + "!";
	}

	public boolean twoAsOne(int a, int b, int c) {
		if (a + b == c || b + c == a || a + c == b)
			return true;
		return false;
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk && c > b)
			return true;
		else if (!bOk && b > a && c > b)
			return true;
		return false;
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (b > a && c > b)
			return true;
		else if (equalOk && a <= b && b <= c)
			return true;
		return false;
	}

	public boolean lastDigit(int a, int b, int c) {
		if ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10))
			return true;
		return false;
	}

	public boolean lessBy10(int a, int b, int c) {
		if (a - b >= 10 || b - c >= 10 || a - c >= 10)
			return true;
		else if (b - a >= 10 || c - b >= 10 || c - a >= 10)
			return true;
		return false;
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (die1 != die2)
			return (die1 + die2);
		if (noDoubles == true && die1 != 6 && die2 != 6)
			return (die1 + die2 + 1);
		if (noDoubles == false)
			return (die1 + die2);
		else
			return (die1 + 1);
	}

	public int maxMod5(int a, int b) {
		if (a == b)
			return 0;
		else if (a % 5 == b % 5)
			return Math.min(a, b);
		else
			return Math.max(a, b);
	}

	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2)
			return 10;
		else if (a == b & b == c)
			return 5;
		else if (b != a && c != a)
			return 1;
		return 0;
	}

	public int greenTicket(int a, int b, int c) {
		if (a == b && b == c)
			return 20;
		else if (a == b || b == c || a == c)
			return 10;
		return 0;
	}

	public int blueTicket(int a, int b, int c) {
		int sumAb = a + b;
		int sumBc = b + c;
		int sumAc = a + c;
		if (sumAb == 10 || sumBc == 10 || sumAc == 10)
			return 10;
		else if (sumAb == sumBc + 10 || sumAb == sumAc + 10)
			return 5;
		return 0;
	}

	public boolean shareDigit(int a, int b) {
		if ((a / 10 == b / 10) || (a % 10 == b % 10))
			return true;
		else if ((a / 10 == b % 10) || (a % 10 == b / 10))
			return true;
		return false;
	}

	public int sumLimit(int a, int b) {
		String aString = String.valueOf(a);
		String sumString = String.valueOf(a + b);
		if (sumString.length() > aString.length())
			return a;
		return a + b;
	}

}
