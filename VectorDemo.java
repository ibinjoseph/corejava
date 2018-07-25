import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector(3);
System.out.println(v.capacity());
System.out.println(v.size());
v.add("Ibin");
v.add("Joseph");
v.add("Abi");
v.add("Abi");
System.out.println(v.capacity());
System.out.println(v);

	}

}
