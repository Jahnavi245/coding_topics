public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop example:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }

        // While loop
        System.out.println("\nWhile loop example:");
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop example:");
        int number = 0;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 5);

        // Enhanced for loop (for-each)
        System.out.println("\nEnhanced for loop example:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Nested loop
        System.out.println("\nNested loop example:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("i: %d, j: %d%n", i, j);
            }
        }

        // Loop with break
        System.out.println("\nLoop with break example:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Value: " + i);
        }

        // Loop with continue
        System.out.println("\nLoop with continue example:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Value: " + i);
        }
    }
}
