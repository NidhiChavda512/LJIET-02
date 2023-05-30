/**
 * 
 */
package programs;

import java.util.Scanner;

/**
 * @author Work
 *
 */

public class Circle {
		double radius;
		double area;
		double circumference;
		final double PI=3.14;
		public void setData()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Radius:");
			radius=sc.nextInt();
		}
		public void getData()
		{
			area=PI*radius*radius;
			System.out.println("Area of circle is:"+area);
			circumference=2*PI*radius;
			System.out.println("circumference of circle is:"+circumference);
		}
		public static void main(String[] args) {
			Circle c=new Circle();
	    	c.setData();
	    	c.getData();
		}
		// TODO Auto-generated method stub

	}


