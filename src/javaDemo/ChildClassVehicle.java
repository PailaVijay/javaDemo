package javaDemo;

public class ChildClassVehicle extends ParentClassVehicle{

	int i1 = 2;
	String s1 = "Vijay";
	public int Mirror()
	{
		System.out.println(i1+ "mirrors");
		return i1;
	}
	public String name()
	{
		System.out.println(s1);
		return s1;
	}
	public void engine()
	{
		System.out.println("four strokes engine");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassVehicle cv= new ChildClassVehicle();
		
		cv.vehicleName();
		cv.color();
		cv.engine();
		cv.Mirror();
		cv.name();
		cv.wheel();
		
	}

}
