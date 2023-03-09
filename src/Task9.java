import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number : ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

        System.out.println("\nPositive numbers : "+positiveNumbers(numbers));
        System.out.println("No negative numbers : "+noNegativeNumbers(numbers));
    }


    public static boolean positiveNumbers(int[] array) {
        int value=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                value++;
            }
        }
        return value > 0;
    }

    public static boolean noNegativeNumbers(int[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                value++;
            }
        }
        return value == 0;
    }
}
