import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Pratice {
	public static void main(String[] args) {

HashMap map= new HashMap();
map.put("Rollno", 123);
map.put("Name", "Pranjali");
map.put("LastName", "Kharat");
Set allkey= map.keySet();
Iterator itr=allkey.iterator();
while(itr.hasNext())
{
	System.out.println(map.get(itr.next()));
}
	}
}