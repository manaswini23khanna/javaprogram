package pack1;

import java.util.Scanner;

class ClassEvenOdd {
    void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int number = scanner.nextInt();

        ClassEvenOdd obj = new ClassEvenOdd();
        obj.evenOdd(number);

        scanner.close();
    }
}
