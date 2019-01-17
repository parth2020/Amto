public class studentTc3 
{
    	int sid;
    	String sname;
    	static String scoll="MU";
  
   	static{System.out.println("Static Block Is Invoked Before Main");}

    	public studentTc3(int sid,String sname)
	{
        	this.sid=sid;
        	this.sname=sname;
    	}

   	void display()
	{
		System.out.println(" ");
       		System.out.println("Student Roll Number: "+sid);
		System.out.println(" ");
       		System.out.println("Student Name: "+sname);
		System.out.println(" ");
       		System.out.println("Student Collage: "+scoll);
		System.out.println(" ");
  	}

   	static void meth()
   	{
       		System.out.println("Static Method Can Be Called" + "Without Creating Object");
   	}

    	public static void main(String[] args)
	{
        	studentTc3 s1 = new studentTc3(1," Parth ");
        	studentTc3 s2 = new studentTc3(2," Joshi ");
        	studentTc3 s3 = new studentTc3(3," Neel ");
        	s1.display();
        	s2.display();
        	s3.display();
    	}
}