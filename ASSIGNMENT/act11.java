import java.util.Scanner.*;
import java.util.*;
public class act11 {
	void even(int n) {
		int s=0;
		for(int i=2;i<n;i=i+2){
			s=s+i;
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		new act11().even(n);
	}
}