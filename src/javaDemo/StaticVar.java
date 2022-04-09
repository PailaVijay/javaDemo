package javaDemo;

public class StaticVar {
	String name;
	String address;
	static String city;// class variables
	 int age;
	//static int age=28;
	 static
	 {
		 city="Chikiti";
	 }
	public StaticVar(String name, String address,int age)
    {
		//age++;
		this.name= name;
		this.address= address;
		this.city = city;
		this.age=age;
		System.out.println(age);
	}
	public void getAddress()
	{
		 System.out.println(name+" "+address+" "+ city+ " "+age);
	}
	public static void getCity()
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		StaticVar obj = new StaticVar("Jisu","Rampur",29);
		StaticVar obj1 = new StaticVar("Vijay","Khardhar",30);
		StaticVar obj2 = new StaticVar("Vicky","Badapalanka",29);
	    obj.getAddress();
	    obj1.getAddress();
	    obj2.getAddress();
	    StaticVar.getCity();
	   // StaticVar.age=3;
	}

}
