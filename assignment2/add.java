import java.util.Scanner;
public class add {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        int firstDigit = num % 10;
        int remainingNum = num / 10;
        int SecondDigit = remainingNum % 10;
        remainingNum = remainingNum / 10;
        int thirdDigit = remainingNum % 10;
        remainingNum = remainingNum / 10;
        int fourthDigit = remainingNum % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);


	}

}
