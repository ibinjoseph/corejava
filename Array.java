
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
	
		}
for(int j=arr.length-1;j>=0;j--)
{
	System.out.println("reverse"+arr[j]);
	
}
for(int i=0;i<arr.length;i++)
{

	if(arr[i]==25)
	{
		k=1;
	}
	else
		k=0;
}
if(k==1)
{
	System.out.println("26 is in the array");
}
else
	System.out.println("26 is not in the array");
}

	

}
