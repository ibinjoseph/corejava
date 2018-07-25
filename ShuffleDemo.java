import java.util.*;
public class ShuffleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
ArrayList b=new ArrayList();
ArrayList a1=new ArrayList(3);
Cars c1=new Cars("Audi","Silver",1200000.00);
Cars c2=new Cars("Ferrari","Black",2220000.00);
Cars c3=new Cars("Lambo","yellow",2120000.00);
Cars c4=new Cars("BMW","blue",1320000.00);


a.add(4);
a.add(3);
a.add(1);

b.add(5);
b.add(6);
b.add(7);

System.out.println("Before Shuffling"+a);
Collections.shuffle(a);
System.out.println("After Shuffling"+a);
Collections.sort(a);
System.out.println("After sorting"+a);
System.out.println(Collections.binarySearch(a, 1));
Collections.copy(b,a);
System.out.println(b);
Collections.fill(a1, c4);
System.out.println(a1);
	}

}
