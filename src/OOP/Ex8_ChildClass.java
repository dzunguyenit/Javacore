package OOP;

public class Ex8_ChildClass extends Ex8_ParentClass {
	public Ex8_ChildClass(String name, String job, int age) {
		super(name, job, age);
		super.printInformation();
	}

	public void intho()

	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Ex8_ChildClass ex8 = new Ex8_ChildClass("nguyen", "kaka", 11);
		ex8.intho();
	}
}