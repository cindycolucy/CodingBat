
public class String1 {

	public String helloName(String name) {
		return ("Hello " + name + "!");
	}

	public String makeAbba(String a, String b) {
		return (a + b + b + a);
	}

	public String makeTags(String tag, String word) {
		return ("<" + tag + ">" + word + "</" + tag + ">");
	}

	public String makeOutWord(String out, String word) {
		return (out.substring(0, 2) + word + out.substring(2, 4));
	}

	public String extraEnd(String str) {
		String newString = ((str.substring(str.length() - 2) + str.substring(str.length()))
				+ (str.substring(str.length() - 2) + str.substring(str.length()))
				+ (str.substring(str.length() - 2) + str.substring(str.length())));
		return newString;
	}

	public String firstTwo(String str) {
		if (str.length() < 2)
			return str;
		String s = (str.substring(0, 2));

		return s;
	}

	public String firstHalf(String str) {
		int half = str.length() / 2;
		return (str.substring(0, half));
	}

	public String withoutEnd(String str) {
		return (str.substring(1, str.length() - 1));
	}

	public String comboString(String a, String b) {
		int alength = a.length();
		int blength = b.length();
		if (alength > blength)
			return b + a + b;
		else
			return a + b + a;
	}

	public String nonStart(String a, String b) {
		String ashort = a.substring(1, a.length());
		String bshort = b.substring(1, b.length());
		return ashort + bshort;
	}

	public String left2(String str) {
		return str.substring(2, str.length()) + str.substring(0, 2);
	}

	public String right2(String str) {
		return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
	}

	public String theEnd(String str, boolean front) {
		if (front)
			return str.substring(0, 1);
		else
			return str.substring(str.length() - 1);
	}

	public String withouEnd2(String str) {
		if (str.length() < 2)
			return "";
		return str.substring(1, str.length() - 1);
	}

	public String middleTwo(String str) {
		return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
	}

	public boolean endsLy(String str) {
		if (str.length() <= 1)
			return false;
		else if (str.equals("ly"))
			return true;
		String s = str.substring(str.length() - 2, str.length());
		if (s.equals("ly"))
			return true;
		return false;
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}

	public String twoChar(String str, int index) {
		if (str.length() < index + 2 || index < 0)
			return str.substring(0, 2);

		return str.substring(index, index + 2);
	}

	public String middleThree(String str) {
		return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
	}

	public boolean hasBad(String str) {
		if (str.length() < 3)
			return false;
		else if ((str.substring(0, 3)).equals("bad"))
			return true;
		else if (str.length() > 3) {
			if (str.substring(1, 4).equals("bad"))
				return true;
		}
		return false;
	}

	public String atFirst(String str) {
		if (str.length() == 1)
			return str + "@";
		else if (str.length() == 0)
			return "@@";
		else
			return str.substring(0, 2);
	}

	public String lastChars(String a, String b) {
		if (a.length() == 0 && b.length() == 0)
			return "@@";
		else if (a.length() == 0)
			return "@" + b.substring(b.length() - 1, b.length());
		else if (b.length() == 0)
			return a.substring(0, 1) + "@";
		else
			return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
	}

	public String conCat(String a, String b) {
		if (a.length() == 0 || b.length() == 0)
			return a + b;
		if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1)))
			return a + b.substring(1, b.length());
		return a + b;
	}

	public String lastTwo(String str) {
		if (str.length() < 2)
			return str;
		else
			return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
	}

	public String seeColor(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("red"))
			return "red";
		else if (str.length() >= 4 && str.substring(0, 4).equals("blue"))
			return "blue";
		else
			return "";
	}

	public boolean frontAgain(String str) {
		if (str.length() < 2)
			return false;
		if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
			return true;
		return false;
	}

	public String minCat(String a, String b) {
		if (a.length() == b.length()) {
			return a + b;
		}
		if (a.length() > b.length()) {
			int diff = a.length() - b.length();
			return a.substring(diff, a.length()) + b;
		} else {
			int diff = b.length() - a.length();
			return a + b.substring(diff, b.length());
		}
	}

	public String extraFront(String str) {
		if (str.length() < 2)
			return str + str + str;
		else {
			String s = str.substring(0, 2);
			return s + s + s;
		}
	}

	public String without2(String str) {
		if (str.length() == 2)
			return "";
		if (str.length() < 2)
			return str;
		if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
			return (str.substring(2, str.length()));
		else
			return str;
	}

	public String deFront(String str) {
		String a = str.substring(0, 1);
		String b = str.substring(1, 2);
		if ((a.equals("a")) && (b.equals("b")))
			return str;
		if (a.equals("a"))
			return a + str.substring(2, str.length());
		if (b.equals("b"))
			return b + str.substring(2, str.length());
		else
			return str.substring(2, str.length());
	}

	public String startWord(String str, String word) {
		int lenStr = str.length();
		int lenWord = word.length();

		if (lenStr == 0 || lenWord > lenStr)
			return "";

		if (lenStr == 1)
			return str.substring(0, 1);
		else if (str.substring(1, lenWord).equals(word.substring(1, lenWord)))
			return str.substring(0, lenWord);
		else
			return "";

	}

	public String withoutX(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1 && str.charAt(0) == 'x')
			return "";
		if ((str.charAt(0) == 'x') && (str.charAt(str.length() - 1) == 'x'))
			return str.substring(1, str.length() - 1);
		else if (str.charAt(0) == 'x')
			return str.substring(1, str.length());
		else if (str.charAt(str.length() - 1) == 'x')
			return str.substring(0, str.length() - 1);
		else
			return str;
	}

	public String withoutX2(String str) {
		if (str.length() == 0)
			return "";
		else if ((str.length() <= 2) && (str.charAt(0) == 'x' || str.charAt(1) == 'x'))
			return "";
		else if ((str.charAt(0) == 'x') && (str.charAt(1) == 'x'))
			return str.substring(2, str.length());
		else if (str.charAt(0) == 'x')
			return str.substring(1, str.length());
		else if (str.charAt(1) == 'x')
			return str.charAt(0) + str.substring(2, str.length());
		return str;
	}

}
