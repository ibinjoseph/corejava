
public class EnumDemo {
enum weekday{Sunday,Monday,Tuesday,Wednessday,Thursday,Friday,Saturday};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
weekday[] w=weekday.values();
for(weekday w1:w)
	System.out.println(w1);
String userInput="Sunday";
if(weekday.valueOf(userInput)==weekday.Friday)
	System.out.println("Weekend");
else
	System.out.println("Not a Weekend");
int k=5;
Integer i=new Integer(k);


		
	}

}
