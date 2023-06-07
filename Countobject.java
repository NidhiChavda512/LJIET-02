package programs;

class StudentEx{
	static int count=0;
	StudentEx()
	{
		count++;
	}
	 public static void getData()
	{
		System.out.println("Total no of objects:"+count);
	}
}
public class Countobject {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEx[] s=new StudentEx[5];
		//StudentEx s1=new StudentEx();
		for(int i=0;i<5;i++) {
			s[i]=new StudentEx();
			
		}
		StudentEx.getData();

	}

}
