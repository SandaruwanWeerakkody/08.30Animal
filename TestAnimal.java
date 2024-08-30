public class TestAnimal{
	public static void main (String args[]){
		Cat c1 = new Cat("tom");
		//System.out.println(c1.toString());
		Dog d1 = new Dog("buul");
		Dog d2 = new Dog("miky");
		//System.out.println(d1.toString());
		d1.greets();
		//System.out.println(d1.toString());
		d2.greets(d2);
		
	}
}
