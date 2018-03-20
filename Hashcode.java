/**
 * 
 */

/**
 * @author vandana
 *
 */
public class Hashcode {
	
	
	     private int id;
	     private String name;
	     public Hashcode(int id, String name)
	     {
	         this.name = name;
	         this.id = id;
	     }
	     public int getId() {
	         return id;
	     }
	     public void setId(int id) {
	         this.id = id;
	     }
	     public String getName() {
	         return name;
	     }
	     public void setName(String name) {
	         this.name = name;
	     }
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashcode alex1 = new Hashcode(1, "Alex");
		Hashcode alex2 = new Hashcode(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));

	}

}
