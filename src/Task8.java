import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
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

        System.out.println("\nArray's elements' sum = "+sum(numbers,0));

    }


    public static int sum(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        } else {
            return array[i] + sum(array, i + 1);
        }
    }
}
