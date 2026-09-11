import java.util.Scanner;

public class Problem02 {

    static boolean palindromeUsingReverse(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return text.equalsIgnoreCase(reverse);
    }

    static boolean palindromeUsingTwoPointers(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(text.charAt(left))
                    != Character.toLowerCase(text.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean palindromeUsingRecursion(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (Character.toLowerCase(text.charAt(left))
                != Character.toLowerCase(text.charAt(right))) {
            return false;
        }
        return palindromeUsingRecursion(text, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Approach 1: " + palindromeUsingReverse(text));
        System.out.println("Approach 2: " + palindromeUsingTwoPointers(text));
        System.out.println("Approach 3: "
                + palindromeUsingRecursion(text, 0, text.length() - 1));

        sc.close();
    }
}
