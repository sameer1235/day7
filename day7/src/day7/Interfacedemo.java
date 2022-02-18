package day7;


interface animal{
	void sound();
}
interface birds{
	void display();
}
public class Interfacedemo implements animal,birds {
	public void sound()
	{
		System.out.println("Every Animal have its own voice");
	}
	public void display(){
		System.out.println("This is a Birds interface");

	}
	public static void main(String[] args) {
		Interfacedemo id = new Interfacedemo();
		id.display();
		id.sound();

	}

}
