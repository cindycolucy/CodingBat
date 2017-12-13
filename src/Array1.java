
public class Array1 {

	public boolean firstLast6(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];
		if (first == 6 || last == 6) {
			return true;
		}
		return false;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public boolean commonEnd(int[] a, int[] b) {
		int firsta = a[0];
		int lasta = a[a.length - 1];
		int firstb = b[0];
		int lastb = b[b.length - 1];
		if ((firsta == firstb) || (lasta == lastb)) {
			return true;
		}
		return false;
	}

	public int sum3(int[] nums) {
		int sum = nums[0] + nums[1] + nums[2];
		return sum;
	}

	public int[] rotateLeft3(int[] nums) {
		int[] myArray = new int[3];
		myArray[0] = nums[1];
		myArray[1] = nums[2];
		myArray[2] = nums[0];
		return myArray;
	}

	public int[] reverse3(int[] nums) {
		int[] newArray = new int[3];
		newArray[0] = nums[2];
		newArray[1] = nums[1];
		newArray[2] = nums[0];
		return newArray;
	}

	public int[] maxEnd3(int[] nums) {
		if (nums[0] > nums[2]) {
			nums[0] = nums[0];
			nums[1] = nums[0];
			nums[2] = nums[0];
		} else if (nums[2] > nums[0]) {
			nums[2] = nums[2];
			nums[1] = nums[2];
			nums[0] = nums[2];
		} else if (nums[2] == nums[0]) {
			nums[2] = nums[2];
			nums[1] = nums[2];
			nums[0] = nums[2];
		}
		return nums;
	}

	public int sum2(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 0) {
			return 0;
		}
		return nums[0] + nums[1];
	}

	public int[] middleWay(int[] a, int[] b) {
		int[] myArray = new int[2];
		myArray[0] = a[1];
		myArray[1] = b[1];
		return myArray;
	}

	public int[] makeEnds(int[] nums) {
		int[] myArray = new int[2];
		myArray[0] = nums[0];
		myArray[1] = nums[nums.length - 1];
		return myArray;
	}

	public boolean has23(int[] nums) {
		if ((nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3)) {
			return true;
		}
		return false;
	}

	public boolean no23(int[] nums) {
		if ((nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3)) {
			return true;
		}
		return false;
	}

	public int[] makeLast(int[] nums) {
		int[] newArray = new int[nums.length * 2];

		newArray[newArray.length - 1] = nums[nums.length - 1];
		return newArray;
	}

	public boolean double23(int[] nums) {
		if ((nums.length != 0 && nums.length != 1)) {
			return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
		}
		return false;
	}

	public int[] fix23(int[] nums) {

		if ((nums[0] == 2) && (nums[1] == 3)) {
			nums[1] = 0;
		}
		if ((nums[1] == 2) && (nums[2] == 3)) {
			nums[2] = 0;
		}
		return new int[] { nums[0], nums[1], nums[2] };
	}

	public int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length != 0) {
			if (a[0] == 1)
				count++;
		}
		if (b.length != 0) {
			if (b[0] == 1)
				count++;
		}
		return count;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		int asum = a[0] + a[1];
		int bsum = b[0] + b[1];
		if (bsum > asum) {
			return b;
		}
		return a;

	}

	public int[] makeMiddle(int[] nums) {
		int[] myArray = new int[2];
		myArray[0] = nums[(nums.length - 1) / 2];
		myArray[1] = nums[(nums.length - 1) / 2 + 1];
		return myArray;
	}

	public int[] plusTwo(int[] a, int[] b) {
		int[] myArray = new int[4];
		myArray[0] = a[0];
		myArray[1] = a[1];
		myArray[2] = b[0];
		myArray[3] = b[1];
		return myArray;
	}

	public int[] swapEnds(int[] nums) {
		int a = nums[0];
		int b = nums[nums.length - 1];
		nums[0] = b;
		nums[nums.length - 1] = a;
		return nums;
	}

	public int[] midThree(int[] nums) {
		int[] myArray = new int[3];
		myArray[0] = nums[(nums.length + 1) / 2 - 2];
		myArray[1] = nums[(nums.length + 1) / 2 - 1];
		myArray[2] = nums[(nums.length + 1) / 2];
		return myArray;
	}

	public int maxTriple(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];
		int middle = nums[((nums.length + 1) / 2) - 1];
		if ((first > last) && (first > middle)) {
			return first;
		}
		if ((last > first) && (last > middle)) {
			return last;
		}
		return middle;
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length == 1)
			return new int[] { nums[0] };
		else if (nums.length == 0)
			return new int[] {};
		else
			return new int[] { nums[0], nums[1] };
	}

	public boolean unlucky1(int[] nums) {
		if ((nums.length == 0) || (nums.length == 1)) {
			return false;
		}
		if ((((nums[0] == 1) && (nums[1] == 3)) || ((nums[1] == 1) && (nums[2] == 3)))
				|| ((nums[nums.length - 2] == 1) && (nums[nums.length - 1] == 3))) {
			return true;
		}
		return false;
	}

	public int[] make2(int[] a, int[] b) {
		int[] newArray = new int[2];
		if (a.length >= 2) {
			newArray[0] = a[0];
			newArray[1] = a[1];
		} else if (a.length == 1) {
			newArray[0] = a[0];
			newArray[1] = b[0];
		} else if (a.length == 0) {
			newArray[0] = b[0];
			newArray[1] = b[1];
		}
		return newArray;
	}

	public int[] front11(int[] a, int[] b) {
		if ((a.length == 0) && (b.length == 0)) {
			return new int[] {};
		} else if (a.length == 0) {
			return new int[] { b[0] };

		} else if (b.length == 0) {
			return new int[] { a[0] };
		}
		return new int[] { a[0], b[0] };
	}

}
