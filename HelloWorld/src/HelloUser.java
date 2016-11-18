// okok
public class HelloUser {
	private String name;
	public HelloUser(String name)
	{
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void greetUser(){
		System.out.println("Hello " + name + "!");
	}
}
