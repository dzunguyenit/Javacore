package OOP;

public class Ex8_ParentClass {
	String name = "Ronaldo";
	String job = "Engineer";
	int age = 20;

	public Ex8_ParentClass() {
		System.out.println("This is Parent class");
	}

	public Ex8_ParentClass(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public void printInformation() {
		System.out.println("This is: " + name + ", job: " + job + " age: " + age);
	}

	public static void main(String[] args) {
		Ex8_ParentClass ex8 = new Ex8_ParentClass();
		ex8.printInformation();
		Ex8_ParentClass ex8_2 = new Ex8_ParentClass("Ronaldo", "Player", 30);
		ex8_2.printInformation();
	}
}
