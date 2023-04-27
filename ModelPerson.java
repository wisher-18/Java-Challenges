package training;
class Person
{
	private String fname, lname;
	private int age;
	Person(String fname, String lname, int age)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	//update first name
	void setFname(String fname)
	{
		System.out.println("First name is updated to "+fname);
		this.fname = fname;
	}
	//update last name
	void setLname(String lname)
	{
		System.out.println("Last name is updated to "+lname);
		this.lname = lname;
	}
	//update age
	void setAge(int age)
	{
		if(age < this.age)
			System.out.println("You cannont make yourself younger!");
		else {
			System.out.println("Age updated");
			this.age=age;
		}
	}
	//getter for first name
	String getFname() {
		return this.fname;
	}
	//getter for last name
	String getLname() {
		return this.lname;
	}
	//getter for age
	int getAge() {
		return this.age;
	}
	//method for introduction
	void getIntroduction() {
		System.out.println("Hi. My name is "+this.fname+ " "+this.lname+". And I am "+this.age+" years old.");
	}
}
public class ModelPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Bhushan", "Pagare", 23);
		Person p2 = new Person("Rishabh", "Pant", 28);
		Person p3 = new Person("Virat", "Kohli", 38);
		Person p4 = new Person("Sachin", "Tendulkar", 50);
		p1.getIntroduction();
		p1.setAge(22);
		p2.setFname("Rohit");
		p2.setLname("Sharma");
		System.out.println(p3.getFname()+" "+p3.getLname());

	}

}
