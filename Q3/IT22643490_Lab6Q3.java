import java.util.Scanner;

public class IT22643490_Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            // termination condition
            if (num == -99) {
                break;
            }

            // validation for negative input (except -99)
            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            // process valid input
            sumOfSquares += num * num;
            count++;
        }

        if (count == 0) {
            System.out.println("No valid numbers entered. RMS cannot be calculated.");
        } else {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        }

        input.close();
    }
}