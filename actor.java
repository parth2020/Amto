public class actor 
{
   
    	int aid;
    	String aname;
   
    	public actor()
	{
		System.out.println("Default Constructor Will Be Called ");
		System.out.println(" ");
    	}

	public actor(int aid,String aname)
	{
		this();
        	this.aid =aid;
        	this.aname=aname;
    	}

    	void display()
	{
        	System.out.println("Actor id: "+aid+"Actor name: "+aname);
		System.out.println(" ");
		displayName(this);
    	}
	
	void displayName(actor a)
	{
		System.out.println("Printing The Name of the Actor");
		System.out.println(" ");
		System.out.println("Actor Name: "+aname);
		System.out.println(" ");	
	}

    	public static void main(String[] args) 
	{
        	actor a1 = new actor(21,"Rauf Lala");
		a1.display();
    	}
}