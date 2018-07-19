class Animal
{
	public void speak()
	{
		System.out.println("peaking");
	}

}
class Cat extends Animal
{
   public void speak()
   {
	   System.out.println("meow");
   }
}
class Dog extends Animal
{
   public void speak()
   {
	   System.out.println("bark");
   }
}
class Horse extends Animal
{
   public void speak()
   {
	   System.out.println("kudukudu");
   }
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String animalName="Horse";
invokeAnimalSound(animalName);
	}

	public static void invokeAnimalSound(String animalName) {
		// TODO Auto-generated method stub
		Animal a=null;
		if(animalName.equals("Horse")) {
			a=new Horse();
			
		}
		if(animalName.equals("Cat")) {
			a=new Cat();
			
		}
		if(animalName.equals("Dog")) {
			a=new Dog();
			
			}
		callsound(a);
			
	}

	public static void callsound(Animal a) {
		// TODO Auto-generated method stub
		a.speak();
		
	}

}
