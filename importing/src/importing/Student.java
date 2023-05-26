package importing;
//self check 7
public class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
	this.name = name;
	this.age = age;
	 }
	
	public void setAge(int age) {
	this.age = age;
	 }
}
class UndergraduateStudent extends Student {
	public UndergraduateStudent(String name) {
		super(name, 18);
	}
	@Override
	public void setAge(int age) {
		super.setAge(age);
	}
}