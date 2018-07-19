
public class Band {
	private String bandName;
	private String singers[];
	private String guitar[];
	private String drum;
	private String keyBoardName;      
	public void printBandDetails() {
		System.out.println(this.bandName);
		for (int i = 0; i < singers.length; i++) {
			System.out.println(this.singers[i]);
		}
		for (int i = 0; i < guitar.length; i++) {
			System.out.println(this.guitar[i]);
		}
		System.out.println(this.drum);
		System.out.println(this.keyBoardName);
		
		
	}
	public int countMembers()
	{
		
	return 2+singers.length+guitar.length;
	}
	public void setBandDetails(String bandName,String singers[],String guitar[],String drum,String keyBoardName) {
		this.bandName = bandName;
		this.singers=singers;
		this.guitar=guitar;
		this.drum=drum;
		this.keyBoardName=keyBoardName;
	
	}
	

}
