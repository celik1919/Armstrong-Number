import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = mec.nextInt();

        int tempNumber = number;
        int numberCounter = 0;
        int basValue;
        int basPow;
        int resault = 0;

        while (tempNumber != 0) {
            numberCounter++;
            tempNumber = tempNumber / 10;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= numberCounter; i++) {
                basPow *= basValue;
            }
            resault += basPow;
            tempNumber /= 10;
        }
        if (resault == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number!");
        }
    }
}