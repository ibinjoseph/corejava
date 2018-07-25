import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add("java");
l.add("cpp");
l.add("php");
System.out.println(l);
for(int i=0;i<l.size();i++)
{
	System.out.println("Reading......."+l.get(i));
}
java.util.Iterator it= l.iterator();
while(it.hasNext())
	{
System.out.println(it.next());
}
ListIterator lt=l.listIterator(l.size());
while(lt.hasPrevious()) {
	System.out.println(lt.previous());
}

}
}
