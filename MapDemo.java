import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put("1","Guru");
hm.put("3","Ibin");
hm.put("2","Abhi");
System.out.println(hm);//Get all the values
//Retrieve using key
System.out.println(hm.get("2"));

Set key=hm.keySet();
Iterator it=key.iterator();
while(it.hasNext()) {
	String keys=(String)it.next();
	System.out.println(hm.get(keys));
	
}
	}

}
