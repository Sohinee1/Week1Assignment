import java.util.Scanner;

public class Problem05 {

    public static String reverseCustomerName(String name) {
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("Reversed Customer Name: "
                + reverseCustomerName(name));

        sc.close();
    }
}
