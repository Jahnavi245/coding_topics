import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functions {
    // Basic method
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with multiple parameters
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // Method overloading
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Varargs method
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Method with array parameter
    public static double average(double[] numbers) {
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method returning an array
    public static int[] generateNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    // Method with default parameter (using method overloading)
    public static int power(int base) {
        return power(base, 2); // Default to square
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Main method to demonstrate all functions
    public static void main(String[] args) {
        // Testing basic method
        greet("Alice");

        // Testing method with return value
        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);

        // Testing method with multiple parameters
        double area = calculateRectangleArea(4.0, 5.0);
        System.out.println("Rectangle area: " + area);

        // Testing method overloading
        System.out.println("Integer multiplication: " + multiply(5, 3));
        System.out.println("Double multiplication: " + multiply(2.5, 3.0));

        // Testing varargs method
        System.out.println("Sum of numbers: " + sum(1, 2, 3, 4, 5));

        // Testing array parameter method
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Average: " + average(numbers));

        // Testing generic method
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};
        System.out.print("Integer Array: ");
        printArray(intArray);
        System.out.print("String Array: ");
        printArray(stringArray);

        // Testing method returning array
        int[] generatedNumbers = generateNumbers(5);
        System.out.print("Generated numbers: ");
        for (int num : generatedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Testing method with default parameter
        System.out.println("2² = " + power(2));
        System.out.println("2³ = " + power(2, 3));
    }
}
