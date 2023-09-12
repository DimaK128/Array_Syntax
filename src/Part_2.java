public class Part_2 {
    public static void main(String[] args) {
        int[] a = new int[100];

        a[4] = 45;

        System.out.println("5th element value: " + a[4]);

        try {
            int invalidValue = a[1000];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
            e.printStackTrace();
        }
    }
}