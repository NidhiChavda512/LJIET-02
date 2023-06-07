package programs;
import java.util.*;
class Student{
	
	Scanner sc=new Scanner(System.in);
	
	 int rollno;
	 String stuName;
	 int marks;
	 
	 void setData() {
		 System.out.println("Enter roll no");
		 rollno=sc.nextInt();
		 System.out.println("Enter name");
		 stuName=sc.next();
		 System.out.println("Enter marks");
		 marks=sc.nextInt();
		 }
	 void getData() {
		 System.out.println("rollno:"+rollno+"name:"+stuName+"marks:"+marks);
	 }
	 
}	 
	 

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s1=new Student[5];
		int n=0;
		do {
			s1[n]=new Student();
			s1[n].setData();
			s1[n].getData();
			n++;
			
		}
		while(n<5);
	}

}
