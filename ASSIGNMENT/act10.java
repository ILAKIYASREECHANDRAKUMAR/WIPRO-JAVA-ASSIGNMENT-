import java.util.Scanner;
public class act10 {
		public static void main(String[] args) {
		int h,r;
		double l,area,volume,pi=22/7;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the height of the cone:");
		h=s.nextInt();
		System.out.println("enter the radius of the cone:");
		r=s.nextInt();
		l=Math.sqrt((r*r)+(h*h));
		area=(pi*r*1)+(pi*r*r);
		System.out.println("surface area of cone:"+area);
		volume=0.333*pi*r*r*h;
		System.out.println("volume of cone:"+volume);
	}

}
