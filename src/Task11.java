import javax.naming.PartialResultException;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd= new Random();

        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(-10,10);
        }

        System.out.println("\nUnsorted array : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n\nBubble-Sorted array : \n");
        bubbleSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }



    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }
    
    public static void bubbleSort(int[] array) {
        
        int i = 0, a = 0, j = a + 1, numberOfSwaps = 0;

        while (i < Math.pow(array.length - 1, 2)) {
            if (array[j] < array[a]) {
                swap(array,j,a);
                numberOfSwaps++;
            }

            if (a == array.length - 2) {
                a = 0;
                j = a + 1;
            } else {
                a++;
                j++;
            }
            i++;
        }
        System.out.println("The numbers of swaps performed to sort the array is : "+numberOfSwaps);
    }
}
