import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scan.nextInt();
        int x =1;
        square(1,n);

        //SecondTask
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a value : ");
            numbers[i] = scan.nextInt();
        }

        reverseNumbers(numbers, 0);


        //THIRD TASK
        System.out.println("\nXn = "+calculateTheValue(n));


        //FOURTH TASK
        System.out.print("\nEnter a number : ");
        int number = scan.nextInt();
        System.out.println("The number's digits = "+ integerNumbers(number));
        System.out.println("The sum of the decimal values of the number = "+integerNumbersSum(number));

        //FIFTH TASK
        System.out.print("\nEnter the first number : ");
        double number1 = scan.nextDouble();
        System.out.print("Enter the second number : ");
        double number2 = scan.nextDouble();
        System.out.println("The sum = "+sumAddingOne(number1,number2));
        System.out.println("The multiplication = "+multiplyAddingOne(number1,number2));


        //SIXTH TASK
        System.out.print("\nEnter a positive integer : ");
        int num = scan.nextInt();
        System.out.println("Binary form : ");
        toBinary(num);

        //SEVENTH TASK
        //Lets take the f(x) = x*x - 2

        double[] f = { -2, -1.75, -1.5, -1.25, -1, -0.75, -0.5, -0.25, 0, 0.25, 0.5, 0.75, 1, 1.25, 1.5, 1.75, 2.0 };
        double a,b,eps;
        System.out.print("\n\nEnter a :");
        a = scan.nextDouble();
        System.out.print("Enter b : ");
        b = scan.nextDouble();
        System.out.print("Enter eps : ");
        eps = scan.nextDouble();
        double root = Root(f,a,b,eps);
        System.out.println("The root for the function f(x) on [a,b] = "+root);

    }

    public static void square(int x, int n) {
        if (x > n) {
            return;
        }
        System.out.println(x*x);

        square(x+1,n);
    }

    public static void reverseNumbers(int[] array, int i) {
        if (i >= array.length) {
            return;
        }

        System.out.println(array[array.length-i-1]);
        reverseNumbers(array, i+1);
    }

    public static double calculateTheValue(int n) {
        if (1 == n) {
            return Math.sqrt(2);
        } else {
            return Math.sqrt(2 + calculateTheValue(n-1));
        }
    }

    public static int integerNumbers(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + integerNumbers(number / 10);
        }

    }

    public static int integerNumbersSum(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number%10 + integerNumbersSum(number / 10);
        }
    }

    public static double sumAddingOne(double number1, double number2) {
        if (number2 == 0){
            return number1;
        } else {
            double sum = number1 + number2;
            double onHand = (int) number1 & (int) number2;
            onHand *= 2;
            return sumAddingOne(sum,onHand);
        }

    }

    public static double multiplyAddingOne(double number1, double number2) {
        if (number2 == 1) {
            return number1;
        } else if (number2 == 0) {
            return 0;
        } else {
            return number1 + multiplyAddingOne(number1, number2-1);
        }
    }

    public static void toBinary(int number) {
        if (number > 0) {
            toBinary(number >> 1);
            System.out.print(number & 1);
        }
    }


    public static double Root(double[] f, double a, double b, double eps) {
        double midPoint = (a + b) / 2;
        if (Math.abs(b - a) < eps) {
            return midPoint;
        }
        if (f[(int)a] * f[(int)midPoint] < 0) {
            return Root(f, a, midPoint, eps);
        } else {
            return Root(f, midPoint, b, eps);
        }
    }

}
