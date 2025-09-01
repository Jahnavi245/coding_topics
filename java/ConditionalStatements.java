public class ConditionalStatements {
    public static void main(String[] args) {
        // If-else statement
        int number = 7;
        if (number < 5) {
            System.out.println("Number is less than 5");
        } else if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is equal to 5");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Enhanced switch (Java 14+)
        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(result);

        // Ternary operator
        int age = 20;
        String canVote = age >= 18 ? "Yes" : "No";
        System.out.println("Can vote? " + canVote);

        // Multiple conditions
        boolean isStudent = true;
        boolean hasId = true;
        if (isStudent && hasId) {
            System.out.println("Can enter the library");
        }

        // Nested if statements
        int score = 85;
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            if (score >= 85) {
                grade = 'B+';
            } else {
                grade = 'B';
            }
        } else {
            grade = 'C';
        }
        System.out.println("Grade: " + grade);

        // Try-catch as a conditional structure
        try {
            int result2 = divide(10, 0);
            System.out.println("Result: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
