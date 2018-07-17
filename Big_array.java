
public class Big_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
int big=arr[0];
for(int i=1;i<arr.length;i++)
{
	if(big<arr[i])
	{
		big=arr[i];
		
	}
}
System.out.println(big);
	}

}
