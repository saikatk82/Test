public class Palindrome {
	public static void main(String args[]) {
		String s = "radar";
		int r = palindrome(s);
		System.out.println(r);
	}

	static int palindrome(String s) {
		String reverse = "";
		int n = s.length();

		for (int i = n - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		if (s.equals(reverse)) {
			System.out.println("Palindrome");
			return 1;
		} else
			System.out.println("Not Palindrome");
		return 0;

	}

}