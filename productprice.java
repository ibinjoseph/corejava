
public class productprice {
	public static void main(String args[])
	{
		double[] prod = null;
		
		prod = new double[5];
		double max=0;
		
		prod[0]=299.00;
		prod[1]=566.3;
		prod[2]=4445;
		prod[3]=5;
		prod[4]=999;
		
		
		for (int i = 0; i < prod.length; i++) {
			if(prod[i]>max)
				max=prod[i];
		}
	System.out.println("MAX IS:"+max);
		
	}
}
