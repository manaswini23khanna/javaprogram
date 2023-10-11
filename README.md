package pack1;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending value: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                
                sum += i;
            }
        }

        System.out.println("The sum of odd numbers between " + start + " and " + end + " is: " + sum);
        
        scanner.close(); 
    }
}
