import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add("Peyter");
hs.add("Peyter");//duplicate ,This will overwrite the last one
System.out.println(hs.add("Peytere"));
System.out.println(hs.add("Peytery"));
System.out.println(hs);
	}

}
