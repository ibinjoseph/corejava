abstract class pe {
	public abstract void WhatDoYouDo();

	public boolean doYouSpeak() {
		System.out.println("Every one Speak");
		return true;
	}
}

class trainer extends pe {

	@Override
	public void WhatDoYouDo() {
		// TODO Auto-generated method stub
		System.out.println("I will Train");
	}

}

class doctor extends pe {

	@Override
	public void WhatDoYouDo() {
		// TODO Auto-generated method stub
		System.out.println("I Will Cure");
	}

}

class pilot extends pe {

	@Override
	public void WhatDoYouDo() {
		// TODO Auto-generated method stub
		System.out.println("I ride Aeroplane");
	}

}

public class AbstractionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pe p;
		p = new trainer();
		System.out.println(p.doYouSpeak());
		p.WhatDoYouDo();
		p = new doctor();
		System.out.println(p.doYouSpeak());
		p.WhatDoYouDo();
		p = new pilot();
		System.out.println(p.doYouSpeak());
		p.WhatDoYouDo();

	}

}
