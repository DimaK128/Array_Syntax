public class Part_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using a for loop to traverse the array
        System.out.println("Using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Using an enhanced for loop (for-each) to traverse the array
        System.out.println("\nUsing an enhanced for loop:");
        for (int value : numbers) {
            System.out.println("Element value: " + value);
        }

        // Using a while loop to traverse the array
        System.out.println("\nUsing a while loop:");
        int index = 0;
        while (index < numbers.length) {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index++;
        }
    }
}