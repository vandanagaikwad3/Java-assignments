/**
 * 
 */

/**
 * @author vandana
 *
 */



	public final class ImutableProg
	{
	    final String name;
	    final int regNo;
	 
	    public ImutableProg(String name, int regNo)
	    {
	        this.name = name;
	        this.regNo = regNo;
	    }
	    public String getName()
	    {
	        return name;
	    }
	    public int getRegNo()
	    {
	        return regNo;
	    }
	
	 
	// Driver class
	//class Test
	//{
	    public static void main(String args[])
	    {
	    	ImutableProg s = new ImutableProg("ABC", 101);
	        System.out.println(s.name);
	        System.out.println(s.regNo);
	 
	        // Uncommenting below line causes error
	        // s.regNo = 102;
	    }
	}
