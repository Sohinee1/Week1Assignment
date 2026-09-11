import java.util.Scanner;

public class Problem03 {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter weight in kg for member " + i + ": ");
            double weight = sc.nextDouble();

            System.out.print("Enter height in metres for member " + i + ": ");
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);
            System.out.printf("Member %d BMI: %.2f (%s)%n",
                    i, bmi, getCategory(bmi));
        }

        sc.close();
    }
}
