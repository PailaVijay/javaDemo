package javaDemo;

public class FruitColor implements FruitIdentification,FruitTaste{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitIdentification fc= new FruitColor();
		fc.AppleRed();
		fc.GrapesBlack();
		fc.GuavaGreen();
		fc.MangoYellow();
		fc.OrangeOrange();
		FruitTaste ft= new FruitColor();
		ft.MangoSweet();
	}

	@Override
	public void MangoYellow() {
		// TODO Auto-generated method stub
		System.out.println("mango color id yellow");
	}

	@Override
	public void AppleRed() {
		// TODO Auto-generated method stub
		System.out.println("apple color is red ");
	}

	@Override
	public void GuavaGreen() {
		// TODO Auto-generated method stub
		System.out.println("guava color is green");
	}

	@Override
	public void OrangeOrange() {
		// TODO Auto-generated method stub
		System.out.println("orange color is orange");
	}

	@Override
	public void GrapesBlack() {
		// TODO Auto-generated method stub
		System.out.println("grapes color is black");
	}

	@Override
	public void MangoSweet() {
		// TODO Auto-generated method stub
		System.out.println("taste is sweet");
	}

   
}
