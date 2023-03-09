import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array's rows : ");
        int n = scan.nextInt();
        System.out.print("Enter the size of the array's columns : ");
        int m = scan.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a number : ");
                array[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.print("Enter the number u'd like to search for in the array : ");
        int searchNumber = scan.nextInt();
        System.out.print("Enter the column u'd like to search in : ");
        int column = scan.nextInt();
        int start = 0, end = array.length - 1;
        if (searchAValue(array,searchNumber,column,start,end) == true ) {
            System.out.println("The element has been found!");
        } else {
            System.out.println("The element has not been found!");
        }
    }


    public static boolean searchAValue(int[][] array, int value, int column, int starterPoint, int endPoint) {

        boolean found = false;

        while (starterPoint <= endPoint) {
            int midPoint = (starterPoint + endPoint) / 2;

            if (array[midPoint][column] == value) {
                found = true;
                break;
            } else if (array[midPoint][column] < value) {
                starterPoint = midPoint + 1;
            } else {
                endPoint = midPoint - 1;
            }
        }

        return found;
    }
}
