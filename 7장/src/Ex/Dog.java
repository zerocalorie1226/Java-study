package Ex;

public class Dog {
	private String name;
	private String type;
	public Dog(String type, String name) {
		this.name=name;
		this.type=type;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getType(){
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void showDogInfo() {
		System.out.println("���� ���� "+type+"�̰� �̸��� "+name+"�Դϴ�.");
	}
	
}
