
 
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Set;
	import java.util.Map.Entry;
	 
	public class HashMapDisplay {
	 
	    public static void main(String a[]){
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        map.put("java", 22);
	        map.put("C", 24);
	        map.put("C++", 27);
	       	        Set<Entry<String, Integer>> set = map.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );
	        for(Map.Entry<String, Integer> entry:list){
	            System.out.println(entry.getKey()+" ==== "+entry.getValue());
	        }
	    }

}
