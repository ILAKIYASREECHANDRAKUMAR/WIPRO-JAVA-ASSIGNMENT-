import java.util.Scanner;
import java.util.*;
public class bmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("enter height in inches: ");
        double inches = input.nextDouble();
        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI);
	}

}
